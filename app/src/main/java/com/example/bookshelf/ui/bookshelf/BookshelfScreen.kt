import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

@Composable
fun BookshelfScreen(viewModel: BooksViewModel) {
    val books = viewModel.books.collectAsState().value

    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(8.dp)
    ) {
        items(books.size) { index ->
            val book = books[index]
            Column(
                modifier = Modifier.padding(8.dp)
            ) {
                AsyncImage(
                    model = book.volumeInfo.imageLinks?.thumbnail?.replace("http", "https"),
                    contentDescription = null,
                    modifier = Modifier.height(150.dp)
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(text = book.volumeInfo.title)
            }
        }
    }
}
