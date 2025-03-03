import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.viewmodel.compose.viewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val repository = BooksRepository(NetworkModule.api)
        val viewModel = BooksViewModel(repository)

        setContent {
            BookshelfScreen(viewModel)
        }
    }
}
