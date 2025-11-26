INSERT INTO users (email, password, name, phone_number, birthday, address, city) VALUES
    ('marko.petrovic@example.com', 'lozinka123', 'Marko Petrović', '+381641234567', '1998-03-15', 'Bulevar Oslobođenja 123', 'Novi Sad');

INSERT INTO users (email, password, name, phone_number, birthday, address, city) VALUES
    ('ana.jovanovic@example.com', 'lozinka123', 'Ana Jovanović', '+38163111222', '2000-07-02', 'Kralja Petra I 5', 'Beograd');

INSERT INTO users (email, password, name, phone_number, birthday, address, city) VALUES
    ('nikola.ilic@example.com', 'lozinka123', 'Nikola Ilić', '+38162123456', '1995-11-30', 'Cara Lazara 18', 'Niš');

INSERT INTO users (email, password, name, phone_number, birthday, address, city) VALUES
    ('jelena.mitrovic@example.com', 'lozinka123', 'Jelena Mitrović', '+381651234890', '1999-01-21', 'Njegoševa 7', 'Kragujevac');



INSERT INTO location (name,description,created_at,address,total_rating,type) VALUES
    ('Spens','asdf','1995-12-30','Bulevar Oslobodjenja',23,'dsds');

INSERT INTO location (name,description,created_at,address,total_rating,type) VALUES
    ('Promenada','fafa','1999-5-16','Bulevar Evrope',11,'gggggg');

INSERT INTO location (name,description,created_at,address,total_rating,type) VALUES
    ('Merkator','jaja','1997-11-22','Futoski put',22,'lllllll');






INSERT INTO event (name, address, type, date, price, recurrent) VALUES
    ('Koncert Bajage', 'Spens, Sutjeska 2', 'MUSIC', '2025-05-10', 1800.00, 0);

INSERT INTO event (name, address, type, date, price, recurrent) VALUES
    ('Stand up veče', 'Svetozara Miletića 10', 'COMEDY', '2025-04-22', 1200.00, 0);

INSERT INTO event (name, address, type, date, price, recurrent) VALUES
    ('Kviz veče – Pub Quiz', 'Laze Telečkog 5', 'QUIZ', '2025-03-15', 300.00, 1);

INSERT INTO event (name, address, type, date, price, recurrent) VALUES
    ('Filmsko veče – Maraton', 'Bulevar Oslobođenja 80', 'MOVIE', '2025-06-01', 500.00, 0);

INSERT INTO event (name, address, type, date, price, recurrent) VALUES
    ('Studentska žurka FTN', 'Trg Dositeja Obradovića 6', 'PARTY', '2025-02-28', 700.00, 1);








INSERT INTO review (created_at, event_count, hidden) VALUES
    ('2025-01-10 18:30:00', 3, 0);

INSERT INTO review (created_at, event_count, hidden) VALUES
    ('2025-01-12 14:15:00', 1, 0);

INSERT INTO review (created_at, event_count, hidden) VALUES
    ('2025-01-15 20:45:00', 5, 1);

INSERT INTO review (created_at, event_count, hidden) VALUES
    ('2025-01-18 09:05:00', 2, 0);

INSERT INTO review (created_at, event_count, hidden) VALUES
    ('2025-01-20 22:00:00', 4, 1);
