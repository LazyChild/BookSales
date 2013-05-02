package booksales

class RestockingList {
    static belongsTo = Book;

    String ISBN
    Integer amount
    Double restPrice
    String state

    static constraints = {
        amount(min: 1)
        restPrice(min: 0)
    }
}
