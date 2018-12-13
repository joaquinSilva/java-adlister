SELECT 'Using adlister_db' AS 'Use Statement';

USE adlister_db;

SELECT 'Truncating users table' AS 'Truncate Statement';
TRUNCATE users;

SELECT 'Truncating ads table' AS 'Truncate Statement';
TRUNCATE ads;

SELECT 'Inserting records into albums table' AS 'Insert Statement';

insert into users (username, email, password)
values  ('admin', 'admin@user.com', 'admin'),
        ('user1', 'user1@user.com', 'user123');

insert into ads (user_id, title, description)
values  (1, 'Awesome Ad', 'This is the best ad ever!'),
        (1, 'Worst Ad', 'This is the worst ad ever.'),
        (2, 'Mediocre Ad', 'This ad is ok, I guess.');


SELECT * FROM users;
# SELECT * FROM ads;