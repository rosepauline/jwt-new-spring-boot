-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               10.6.7-MariaDB - mariadb.org binary distribution
-- Server OS:                    Win64
-- HeidiSQL Version:             11.3.0.6295
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

-- Dumping data for table jwt_demo.jwt_request: ~2 rows (approximately)
/*!40000 ALTER TABLE `jwt_request` DISABLE KEYS */;
INSERT INTO `jwt_request` (`id`, `password`, `username`, `token`) VALUES
	(1, '$2a$10$1LTaRxC9qF6rlK1QV7p.tuyo9TMjssURHEOqK6kTOkH/b.EVu0xbW', 'rose', 'eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJyb3NlIiwiZXhwIjoxNjU5MzU1NTExLCJpYXQiOjE2NTkzMzc1MTF9.lXCR2-4VjX_btK12c0AuaKYnWfkdFER_ea6i2-itbET4xVp6w9FppyYtT1CmQBxi5cqvUi-P02dXI0X2sBhcOw'),
	(2, '$2a$10$1LTaRxC9qF6rlK1QV7p.tuyo9TMjssURHEOqK6kTOkH/b.EVu0xbW', 'pauline', 'eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJwYXVsaW5lIiwiZXhwIjoxNjU5MzYzODc0LCJpYXQiOjE2NTkzNDU4NzR9.d-ZGqtd9Wv1dgNU6wSY1mFZoZJeby3LtR0GR9m-RxitLQbKGaRkhPqxrb1E8BReTkjp-F9F-Ge8X9hiqtwqdzg');
/*!40000 ALTER TABLE `jwt_request` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
