INSERT INTO members(member_name,phone,email) VALUES ("Neco", 914256769,"neco@gmail.com");
INSERT INTO members(member_name,phone,email) VALUES ("Tiago",931425698,"tiago@gmail.com");
INSERT INTO members(member_name,phone,email) VALUES ("Diney",961425698,"diney@gmail.com");
INSERT INTO publishers(publisher_name) VALUES ("Porto Editora");
INSERT INTO publishers(publisher_name) VALUES ("Leya");
INSERT INTO publishers(publisher_name) VALUES ("Odysseias");
INSERT INTO authors(author_name) VALUES ("Tolstoi");
INSERT INTO authors(author_name) VALUES ("Saramago");
INSERT INTO authors(author_name) VALUES ("Fernando Pessoa");
INSERT INTO books(book_name, date_released, author_id, publisher_id) VALUES ("Ensaio cegueira",1985, 2, 3);
INSERT INTO books(book_name, date_released, author_id, publisher_id) VALUES ("War and Peace", 1805, 1, 1);
INSERT INTO books(book_name, date_released, author_id, publisher_id) VALUES ("A Mensagem",1975,3, 2);
INSERT INTO books(book_name, date_released, author_id, publisher_id) VALUES ("Mulan",1995,2, 2);
INSERT INTO books(book_name, date_released, author_id, publisher_id) VALUES ("Golias",1987,3, 3);
INSERT INTO books(book_name, date_released, author_id, publisher_id) VALUES ("Harry Potter",2000,2, 1);
INSERT INTO books(book_name, date_released, author_id, publisher_id) VALUES ("Game of Thrones",1975,3, 2);
INSERT INTO reservations(loan_date, expected_date_return, return_date, member_id, book_id) VALUES ("2018-07-28", "2018-08-03", "2018-08-05", 1, 2);
INSERT INTO reservations(loan_date, expected_date_return, return_date, member_id, book_id) VALUES ("2019-10-07","2019-10-15","2019-10-17", 2, 1);
INSERT INTO reservations(loan_date, expected_date_return, return_date, member_id, book_id) VALUES ("2018-07-22", "2018-07-28", "2018-07-31", 3, 3);






