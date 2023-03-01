package phan05

fun main() {
    val color = Color.RED
    getColor(color)
    color.showColor()
}

fun getColor(color: Color) = when (color) {
    Color.RED -> println("getColor RED ${color.nameVN}")
    Color.YELLOW -> println("getColor YELLOW ${color.nameVN}")
    Color.BLUE -> println("getColor BLUE ${color.nameVN}")
}

enum class Color(val nameVN: String) {
    RED("Đỏ") {
        override fun showColor() {
            println("This is RED")
        }
    },
    YELLOW("Vàng") {
        override fun showColor() {
            println("This is YELLOW")
        }
    },
    BLUE("Xanh") {
        override fun showColor() {
            println("This is BLUE")
        }
    };

    open fun showColor() {}
}