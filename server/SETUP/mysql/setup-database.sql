
CREATE USER 'admin'@'localhost' IDENTIFIED BY 'admin';
GRANT ALL ON green_sentinel.* TO 'admin'@'localhost';
GRANT ALL ON green_sentinel.* TO 'admin'@'%';

CREATE USER 'admin'@'localhost' IDENTIFIED BY 'admin';
CREATE USER 'admin'@'%' IDENTIFIED BY 'admin';