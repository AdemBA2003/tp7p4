import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class BooksRepository(private val apiService: BooksApiService) {
    suspend fun searchBooks(query: String) = withContext(Dispatchers.IO) {
        apiService.searchBooks(query)
    }

    suspend fun getBookDetails(volumeId: String) = withContext(Dispatchers.IO) {
        apiService.getBookDetails(volumeId)
    }
}
