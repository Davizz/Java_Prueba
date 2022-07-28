-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 22-07-2022 a las 16:46:48
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 7.4.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `form_users_books`
--
CREATE DATABASE IF NOT EXISTS `form_users_books` DEFAULT CHARACTER SET utf8 COLLATE utf8_bin;
USE `form_users_books`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `book`
--

DROP TABLE IF EXISTS `book`;
CREATE TABLE IF NOT EXISTS `book` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `created_at` datetime NOT NULL,
  `updated_at` datetime NOT NULL,
  `author` varchar(225) COLLATE utf8_bin NOT NULL,
  `title` varchar(225) COLLATE utf8_bin NOT NULL,
  `cat_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKcpa3bj39l5v3136txpissgppm` (`cat_id`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `book`
--

INSERT INTO `book` (`id`, `created_at`, `updated_at`, `author`, `title`, `cat_id`) VALUES
(1, '2022-07-22 13:48:13', '2022-07-22 13:48:13', 'julio iglesias', '200 leguas', 1),
(2, '2022-07-22 13:48:39', '2022-07-22 13:48:39', 'ludo el mejor', 'libro 2', 2),
(3, '2022-07-22 13:49:00', '2022-07-22 13:49:00', 'luis', 'libro3', 3),
(4, '2022-07-22 13:49:23', '2022-07-22 13:49:23', 'qwewqeqwe', 'libro4', 2),
(5, '2022-07-22 13:49:43', '2022-07-22 13:49:43', 'ludo', 'libro5', 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `book_details`
--

DROP TABLE IF EXISTS `book_details`;
CREATE TABLE IF NOT EXISTS `book_details` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `page_number` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `publication_year` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `purchase_year` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `book_details`
--

INSERT INTO `book_details` (`id`, `page_number`, `publication_year`, `purchase_year`) VALUES
(1, '190', '1900', '2019'),
(2, '200', '1900', '2005'),
(3, '456', '2000', '2005'),
(4, '100', '1999', '2019'),
(5, '900', '1883', '2000');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `category`
--

DROP TABLE IF EXISTS `category`;
CREATE TABLE IF NOT EXISTS `category` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `created_at` datetime NOT NULL,
  `updated_at` datetime NOT NULL,
  `category_name` varchar(100) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `category`
--

INSERT INTO `category` (`id`, `created_at`, `updated_at`, `category_name`) VALUES
(1, '2022-07-22 13:47:42', '2022-07-22 13:47:42', 'cat1'),
(2, '2022-07-22 13:47:45', '2022-07-22 13:47:45', 'cat2'),
(3, '2022-07-22 13:47:48', '2022-07-22 13:47:48', 'cat3');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `role`
--

DROP TABLE IF EXISTS `role`;
CREATE TABLE IF NOT EXISTS `role` (
  `authority` varchar(255) COLLATE utf8_bin NOT NULL,
  `username` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  UNIQUE KEY `ix_auth_username` (`username`,`authority`) USING HASH,
  KEY `FK13nv3h965w27i114ylfgt9b4d` (`username`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `role`
--

INSERT INTO `role` (`authority`, `username`) VALUES
('ROLE_OWNER', 'Txispas03'),
('ROLE_ADMIN', 'gorka'),
('ROLE_USER', 'ludovic');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE IF NOT EXISTS `user` (
  `username` varchar(255) COLLATE utf8_bin NOT NULL,
  `created_at` datetime NOT NULL,
  `updated_at` datetime NOT NULL,
  `confirmPassword` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `email` varchar(40) COLLATE utf8_bin DEFAULT NULL,
  `enabled` bit(1) DEFAULT NULL,
  `name` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `password` varchar(255) COLLATE utf8_bin NOT NULL,
  `surname` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`username`),
  UNIQUE KEY `uk_email_unik` (`email`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `user`
--

INSERT INTO `user` (`username`, `created_at`, `updated_at`, `confirmPassword`, `email`, `enabled`, `name`, `password`, `surname`) VALUES
('Txispas03', '2022-07-21 15:52:32', '2022-07-22 14:24:16', '$2a$10$gtoZUs5TzmHddVEoyRiyQu3ifL7kSaBFFRBjnYZzBVTXSD.Z5oG7C', 'openmindrobotika@gmail.com', b'1', 'Jose maria correa ', '$2a$10$gtoZUs5TzmHddVEoyRiyQu3ifL7kSaBFFRBjnYZzBVTXSD.Z5oG7C', 'PEREZ'),
('ludovic', '2022-07-22 13:43:45', '2022-07-22 13:54:15', '$2a$10$9R8Y2.K60ZCdzQtdxfkIredcP3wC.zcxCVdXQQdA9nRw18/YhL/Wa', 'ludo@email.com', b'1', 'Ludo', '$2a$10$9R8Y2.K60ZCdzQtdxfkIredcP3wC.zcxCVdXQQdA9nRw18/YhL/Wa', 'LAISNEZ'),
('gorka', '2022-07-22 13:44:41', '2022-07-22 13:54:28', '$2a$10$m80l4psg6z7ALFp.e1W.fe8x33b0KCiVmNdNtPU44SQZxr1iVwjrq', 'gorka@gmail.com', b'1', 'Gorka', '$2a$10$m80l4psg6z7ALFp.e1W.fe8x33b0KCiVmNdNtPU44SQZxr1iVwjrq', 'PEREZ');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `user_book`
--

DROP TABLE IF EXISTS `user_book`;
CREATE TABLE IF NOT EXISTS `user_book` (
  `user_id` varchar(255) COLLATE utf8_bin NOT NULL,
  `book_id` bigint(20) NOT NULL,
  KEY `FK85pwltn867pjxog1gk5smtqcw` (`book_id`),
  KEY `FKbc0bwdnndnxhct38sinbem0n0` (`user_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `user_book`
--

INSERT INTO `user_book` (`user_id`, `book_id`) VALUES
('Txispas03', 1),
('ludovic', 2),
('gorka', 3),
('gorka', 4),
('gorka', 5);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
