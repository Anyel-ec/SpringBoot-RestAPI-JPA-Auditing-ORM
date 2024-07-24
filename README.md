## Project Overview

This project is a Spring Boot application that provides RESTful APIs for managing authors, books, favorities, users, and numbers. The application includes separate controllers for each entity and uses services to handle business logic. The entities are persisted in a database using JPA.

## Technologies Used
- Spring Boot
- Spring Data JPA
- Hibernate
- Lombok
- RESTful API

## Controllers

### AuthorsControllerApp

- **Base URL:** `/app/authors`

#### Endpoints:

- `GET /`: Retrieve all authors.
- `GET /{id}`: Retrieve an author by ID.
- `POST /`: Create a new author.
- `PUT /{id}`: Update an existing author.
- `DELETE /{id}`: Delete an author by ID.
- `GET /with-books`: Retrieve all authors with their books.
- `GET /book-author`: Retrieve the author of a specified book.

### BooksControllerApp

- **Base URL:** `/app/books`

#### Endpoints:

- `GET /`: Retrieve all books.
- `GET /{id}`: Retrieve a book by ID.
- `POST /`: Create a new book.
- `PUT /{id}`: Update an existing book.
- `DELETE /{id}`: Delete a book by ID.

### FavoritiesControllerApp

- **Base URL:** `/app/favorities`

#### Endpoints:

- `GET /`: Retrieve all favorities.
- `GET /{id}`: Retrieve a favority by ID.
- `POST /`: Create a new favority.
- `PUT /{id}`: Update an existing favority.

### UsersControllerApp

- **Base URL:** `/app/users`

#### Endpoints:

- `GET /`: Retrieve all users.
- `GET /{id}`: Retrieve a user by ID.
- `POST /`: Create a new user.
- `PUT /{id}`: Update an existing user.
- `DELETE /{id}`: Delete a user by ID.
- `GET /count`: Count the total number of users.

### NumeroControllerApp

- **Base URL:** `/app/numeros`

#### Endpoints:

- `POST /guardar/{numero}`: Save a number.
- `GET /tabla/{numero}`: Determine if a number is even or odd.
- `GET /pares`: Retrieve all even numbers.
- `GET /impares`: Retrieve all odd numbers.

## Models

### AuthorsApp

- Fields:
    - `Integer id_ap`
    - `String firstName_ap`
    - `String lastName_ap`
    - `Date createdAt_ap`
    - `Date updatedAt_ap`

### BooksApp

- Fields:
    - `Integer id_ap`
    - `String title_ap`
    - `String publishingYear_ap`
    - `String genre_ap`
    - `AuthorsApp author_ap`
    - `Date createdAt_ap`
    - `Date updatedAt_ap`

### FavoritiesApp

- Fields:
    - `Integer id_ap`
    - `UsersApp user_id_appd`
    - `BooksApp books_id_appd`
    - `Date createdAt`
    - `Date updatedAt`

### UsersApp

- Fields:
    - `Integer id_ap`
    - `String username_ap`
    - `Date createdAt_ap`
    - `Date updatedAt_ap`

### ParesApp

- Fields:
    - `Long numero_ap`

### ImparesApp

- Fields:
    - `Long numero_ap`

## Services

### AuthorsServiceApp

- Methods:
    - `List<AuthorsApp> getAllAuthors()`
    - `AuthorsApp getAuthorById(Integer id)`
    - `AuthorsApp saveAuthor(AuthorsApp author)`
    - `void deleteAuthor(Integer id)`
    - `List<Object[]> findAllAuthorsWithBooks()`
    - `List<Object[]> findAuthorOfBook(String title)`

### BooksServiceApp

- Methods:
    - `List<BooksApp> getAllBooks()`
    - `BooksApp getBookById(Integer id)`
    - `BooksApp saveBook(BooksApp book)`
    - `void deleteBook(Integer id)`

### FavoritiesServiceApp

- Methods:
    - `List<FavoritiesApp> getAllFavorities()`
    - `FavoritiesApp getFavoritiesById(Integer id)`
    - `FavoritiesApp saveFavorities(FavoritiesApp favorities)`

### UsersServiceApp

- Methods:
    - `List<UsersApp> getAllUsers()`
    - `UsersApp getUserById(Integer id)`
    - `UsersApp saveUser(UsersApp user)`
    - `void deleteUser(Integer id)`
    - `Long countUsers()`

### NumeroServiceApp

- Methods:
    - `void guardarNumero(Long numero)`
    - `String determinarTabla(Long numero)`
    - `List<ParesApp> obtenerPares()`
    - `List<ImparesApp> obtenerImpares()`

## Installation

1. Clone the repository:
   ```sh
   git clone https://github.com/Anyel-ec/SpringBoot-RestAPI-JPA-Auditing-ORM
   ```
2. Navigate to the project directory:
   ```sh
   cd https://github.com/SpringBoot-RestAPI-JPA-Auditing-ORM
   ```
3. Build the project:
   ```sh
   mvn clean install
   ```
4. Run the application:
   ```sh
   mvn spring-boot:run
   ```

## Usage

Access the APIs via `http://localhost:8080/app/{entity}`.

## Contributing

1. Fork the repository.
2. Create a new branch:
   ```sh
   git checkout -b feature-branch
   ```
3. Make your changes and commit them:
   ```sh
   git commit -m "Description of changes"
   ```
4. Push to the branch:
   ```sh
   git push origin feature-branch
   ```
5. Open a pull request.

## License
This project is licensed under the MIT License - see the LICENSE file for details.
