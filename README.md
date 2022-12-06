# Personal-Library-System
## **System Specifications**
The library app will allow users and staff to interact with the library’s inventory. The system will consist of a number of features with the first being an account feature where customers can make unique accounts and log in with them. Employees have access to a different account that allows access to features that users should not have access too. Next, the app will have a database that tracks new users and books the library has. The database will track the book’s name, author, genre, id, whether it is checked out or not, who has the book checked out. Users will be able to search for books based on keywords and withdraw books that are currently in stock. Users are able to return books and are notified of the time until overdue. Users can see what books they have checked out at any given time. Users can also report damages of any books and notify admins of the issue. Users can review books after they’ve returned it and view other people’s reviews. Admins can search for specific books and see who is borrowing it. Admins can also add new books to the database and delete any if needed. Admins can also respond to and resolve report tickets. Users should also be able to view the most recent New York Times Best Sellers and find nearby libraries.

## **Feature Specifications**
- ### **Account**
    Users should be able to create a unique account, login with it and be able to logout. Admins should be able to login with their credentials and logout.

- ### **Database**
    Stores book information (ID, title, author, genre, checkout status, customer ID) and customer information (ID, first name, last name).

- ### **Search**
    A spinner that filters by the user’s input and displays book if criteria matches

- ### **Bookview**
    Users can see what book they took out, report damage with a button and review button that brings the user to a review page

- ### **Report**
    Users can make a ticket for damaged books. Admins can see active tickets and resolve them.

- ### **Review**
    Users can write reviews and rate books upon returning it. Users should be able to see reviews
    
- ### **Recent Arrivals**
    Users can view the list of recent New York Times Bestsellers books.
    
- ### **Nearby Libraries**
    Users should be able to locate nearby libraries.

## **Iteration 1 Specifications and Limitations**
- ### **Basic Login**
    A single account for users and a single account for admins that gives access to different views. Both can logout. No new accounts for this iteration

- ### **Home Screen**
    The user screen has My Books button and Search Books button. The admin screen will just have a Manage Books button

- ### **Database**
    The database will be primitive, consisting of a local file generated on the phone upon installation. It will have 30 books on install and admins will be able to add or delete books.

- ### **User My Books**
    A table that displays all the users checked out books and information. A check in button will be present that allows the user to “put back” a book.

- ### **User Search**
    Displays all available books and has a checkout button to checkout book.

- ### **Admin Manage Books**
    Displays all available books with a delete button available. An add button at the top should bring the admin to an add books page

- ### **Admin Add Book**
    Brings up a form for the admin to fill out

## **Iteration 2 Specifications and Limitations**
- ### **Advanced Login**
    Users can now create different accounts that will save books specifically to them. Admin only has 1 universal account. Accounts are limited to a local device. Future iterations could utilize a cloud base system for accounts.

- ### **Search**
   Users can now search for a specific book, author, or genre within the user search page.

- ### **Report System**
    Users can now report damages on a certain book and include a description. Admins can view reported damage tickets and resolve them.

- ### **Advanced Book View**
    Users can now click on a book to view more in depth information

- ### **Descriptions**
    Books now have descriptions that give a brief summary of what it is about. Admin must now give a description when adding a book.

- ### **Open Source Libraries**
    
    - #### Calligraphy
    Allows for custom fonts that improve the look of buttons and text in a fast manner
    
    - #### Dynamic Toasts
    Improves the look of toast messages to provide better feedback to the user

## **Iteration 3 Specifications (APIs)**
- ### Google Books
Admin can now add books faster by searching for books using Google books api. Admins search through a list of books based on their search query and add it to the local storage of books. If no results appear, Admins can still manually add books
- ### ZXing Android Embedded
Admins can now scan qr codes that returns the attached book name. QR codes would be physically on books and act as a way to track a books physical location. This is intended for admins to confirm a book has been returned and makes the book available again to other users.
