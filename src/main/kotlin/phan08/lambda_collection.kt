package phan08

data class Grocery(
    val name: String,
    val category: String,
    val unit: String,
    val unitPrice: Double,
    val quantity: Int,
)

fun main() {
    val groceries = listOf(
        Grocery("Tomato", "Vegetable", "Kg", 120.5, 10),
        Grocery("Potato", "Vegetable", "Kg", 150.0, 8),
        Grocery("Cabbage", "Vegetable", "Kg", 130.0, 6),
        Grocery("Olive oil", "Pantry", "Bottle", 550.0, 1),
        Grocery("Ice Cream", "Frozen", "Pack", 110.0, 10),
    )
}