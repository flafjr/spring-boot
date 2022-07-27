CREATE TABLE IF NOT EXISTS `users` (
    `user_id`     VARCHAR(40) PRIMARY KEY,
    `userType`    VARCHAR(50) NOT NULL,
    `email`       VARCHAR(50) NOT NULL,
    `phoneNumber` VARCHAR(50) NOT NULL
);