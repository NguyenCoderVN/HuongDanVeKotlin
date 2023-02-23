package phan03

class Address(
    val street: String,
    val district: String,
    val country: String
) {
    override fun toString(): String {
        return "Address(street='$street', district='$district', country='$country')"
    }
}