SELECT 'Using adlister_db' AS 'Use Statement';
# SHOW INDEX FROM ads;
# ALTER TABLE ads
# DROP FOREIGN KEY user_id;
# DROP INDEX user_id ON ads;
USE adlister_db;

# SELECT 'Truncating ads table' AS 'Truncate Statement';
# TRUNCATE ads;
#
# SELECT 'Truncating users table' AS 'Truncate Statement';
# TRUNCATE users;

SELECT 'Inserting records into users table' AS 'Insert Statement';

insert into users (username, email, password)
values  ('admin', 'admin@user.com', 'admin'),
        ('user1', 'user1@user.com', 'user123');

SELECT 'Inserting records into ads table' AS 'Insert Statement';

insert into ads (user_id, title, description)
values  (1, 'Awesome Ad', 'This is the best ad ever!'),
        (1, 'Worst Ad', 'This is the worst ad ever.'),
        (2, 'Mediocre Ad', 'This ad is ok, I guess.');


# SELECT * FROM users;
# SELECT * FROM ads;