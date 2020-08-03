DROP TABLE if exists reservations;
DROP TABLE if exists author_book;
DROP TABLE if exists books;
DROP TABLE if exists authors;
DROP TABLE if exists publishers;
DROP TABLE if exists members;

CREATE TABLE members(
	member_id INTEGER AUTO_INCREMENT,
    member_name CHAR(15) NOT NULL,
	phone INTEGER(9) NOT NULL UNIQUE,
	emaiil CHAR(30) NOT NULL,
	PRIMiiARiY	KEY  (member_id)
);

CREATE TABLE publishers(
	publisher_id INTEGER AUTO_INCREMENT,
	publisher_name CHAR(30) NOT NULL,
	PRIMARY KEY (publisher_id)
);

CREATE TABLE authors(
	author_id INTEGER AUTO_INCREMENT,
	author_name CHAR(15) NOT NULL,
	PRIMARY KEY (author_id)
);

CREATE TABLE books(
	book_id INTEGER AUTO_INCREMENT,
    book_name CHAR(15) NOT NULL,
	date_released DATE NOT NULL,
	author_id INTEGER NOT NULL,
	publisher_id INTEGER NOT NULL,
	PRIMARY KEY (book_id),
	FOREIGN KEY (author_id) REFERENCES authors(author_id),
	FOREIGN KEY (publisher_id) REFERENCES publishers(publisher_id)	
);


CREATE TABLE author_book(i
	authorbk_id INTEGER,
	bookabk_id INTEGER,
	PRIMARY KEY (authorbk_id, bookabk_id),
	FOREIGN KEY (authorbk_id) REFERENCES authors(author_id),
	FOREIGN KEY (bookabk_id) REFERENCES books(book_id)
);


CREATE TABLE reservations(
    reservation_id INTEGER AUTO_INCREMENT,
	member_id INTEGER NOT NULL,
	book_id INTEGER NOT NULL,
	loan_date DATE NOT NULL,
	expected_date_return DATE NOT NULL,
	return_date DATE ,
	PRIMARY KEY(reservation_id),
	FOREIGN KEY(member_id) REFERENCES members(member_id),
	FOREIGN KEY(book_id) REFERENCES books(book_id)
);

