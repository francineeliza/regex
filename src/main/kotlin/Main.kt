fun main() {
    val name = "Francine Eliza"
    val email = "francine.eliza@example.com"
    val password = "P@ssword1234"
    val phoneNumber = "1234567890"
    val zipCode = "12345678"

    val nameRegex = "^[a-zA-Z ]+$"
    val emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$"
    val passwordRegex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$"
    val phoneNumberRegex = "^[0-9]{10}$"
    val zipCodeRegex = "^[0-9]{8}$"

    if (!validateInput(name, nameRegex)) {
        println("Nome inválido")
    }

    if (!validateInput(email, emailRegex)) {
        println("Email inválido")
    }

    if (!validateInput(password, passwordRegex)) {
        println("Senha inválida")
    }

    if (!validateInput(phoneNumber, phoneNumberRegex)) {
        println("Número de telefone inválido")
    }

    if (!validateInput(zipCode, zipCodeRegex)) {
        println("CEP inválido")
    }
}
fun validateInput(input: String, regex: String): Boolean {
    return input.matches(Regex(regex))
}