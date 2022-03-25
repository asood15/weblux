CREATE TABLE IF NOT EXISTS DELIVERY(
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    item_name varchar(50) not null,
    quantity INTEGER not null,
    user_name varchar(50) not null
);
