-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 20-07-2022 a las 09:04:09
-- Versión del servidor: 10.4.19-MariaDB
-- Versión de PHP: 8.0.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `form_initsession`
--
CREATE DATABASE IF NOT EXISTS `form_initsession` DEFAULT CHARACTER SET utf8 COLLATE utf8_bin;
USE `form_initsession`;

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
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Truncar tablas antes de insertar `book`
--

TRUNCATE TABLE `book`;
--
-- Volcado de datos para la tabla `book`
--

INSERT DELAYED INTO `book` (`id`, `created_at`, `updated_at`, `author`, `title`, `cat_id`) VALUES
(1, '2022-07-20 06:19:11', '2022-07-20 06:19:11', 'Julio Verne', 'Veinte mil leguas de viaje submarino', 2),
(2, '2022-07-20 06:19:52', '2022-07-20 06:19:52', 'Bernard Werber', 'Hormigas', 2),
(3, '2022-07-20 06:20:35', '2022-07-20 06:20:35', 'Victor Hugo', 'Los miserables', 3),
(4, '2022-07-20 06:21:14', '2022-07-20 06:21:14', 'Stephen King', 'Cujo', 5),
(5, '2022-07-20 06:22:13', '2022-07-20 06:22:13', 'La Fontaine', 'Fábulas', 1),
(6, '2022-07-20 06:23:09', '2022-07-20 06:23:09', 'George Sand', 'La pequeña Fadette', 6),
(7, '2022-07-20 06:23:50', '2022-07-20 06:23:50', 'George Sand', 'Historia de mi vida', 6),
(8, '2022-07-20 06:25:23', '2022-07-20 06:25:23', 'Guy de Maupassant', 'Bel ami', 6),
(9, '2022-07-20 06:26:28', '2022-07-20 06:26:28', 'François Rabelais', 'Gargantua y Pantagruel', 3),
(10, '2022-07-20 06:44:25', '2022-07-20 06:44:25', 'François Rabelais', 'Tercer libro de Pantagruel', 6);

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
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Truncar tablas antes de insertar `book_details`
--

TRUNCATE TABLE `book_details`;
--
-- Volcado de datos para la tabla `book_details`
--

INSERT DELAYED INTO `book_details` (`id`, `page_number`, `publication_year`, `purchase_year`) VALUES
(1, '205', '1883', '2001'),
(2, '208', '1985', '2001'),
(3, '380', '1878', '2005'),
(4, '380', '1985', '2001'),
(5, '180', '1555', '1980'),
(6, '180', '1849', '2001'),
(7, '205', '1855', '2003'),
(8, '206', '1885', '1975'),
(9, '250', '1546', '1975'),
(10, '180', '1546', '1975');

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
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Truncar tablas antes de insertar `category`
--

TRUNCATE TABLE `category`;
--
-- Volcado de datos para la tabla `category`
--

INSERT DELAYED INTO `category` (`id`, `created_at`, `updated_at`, `category_name`) VALUES
(1, '2022-07-20 06:17:52', '2022-07-20 06:17:52', 'Fábulas'),
(2, '2022-07-20 06:16:17', '2022-07-20 06:16:17', 'Aventuras'),
(3, '2022-07-20 06:17:28', '2022-07-20 06:17:28', 'Bibliografía'),
(4, '2022-07-20 06:17:36', '2022-07-20 06:17:36', 'Teatro'),
(5, '2022-07-20 06:17:41', '2022-07-20 06:17:41', 'Terror'),
(6, '2022-07-20 06:17:46', '2022-07-20 06:17:46', 'Novela');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `role`
--

DROP TABLE IF EXISTS `role`;
CREATE TABLE IF NOT EXISTS `role` (
  `authority` varchar(255) COLLATE utf8_bin NOT NULL,
  `username` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  KEY `IDXirsamgnera6angm0prq1kemt2` (`authority`),
  KEY `FK13nv3h965w27i114ylfgt9b4d` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Truncar tablas antes de insertar `role`
--

TRUNCATE TABLE `role`;
--
-- Volcado de datos para la tabla `role`
--

INSERT DELAYED INTO `role` (`authority`, `username`) VALUES
('ROLE_ADMIN', 'ludo1974'),
('ROLE_USER', 'marcel'),
('ROLE_OWNER', 'miguel1955'),
('ROLE_USER', 'mickael2000');


--ludo1974		Admin123	
--marcel		User123
--miguel1955	Owner123
--mickael2000	Otro123

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE IF NOT EXISTS `user` (
  `username` varchar(255) COLLATE utf8_bin NOT NULL,
  `created_at` datetime NOT NULL,
  `updated_at` datetime NOT NULL,
  `confirm_password` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `email` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `enabled` bit(1) DEFAULT NULL,
  `name` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `password` varchar(225) COLLATE utf8_bin NOT NULL,
  `surname` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`username`),
  UNIQUE KEY `uk_email_unik` (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Truncar tablas antes de insertar `user`
--

TRUNCATE TABLE `user`;
--
-- Volcado de datos para la tabla `user`
--

INSERT DELAYED INTO `user` (`username`, `created_at`, `updated_at`, `confirm_password`, `email`, `enabled`, `name`, `password`, `surname`) VALUES
('ludo1974', '2022-07-20 06:27:39', '2022-07-20 07:01:15', '$2a$10$75WBIwcSOjSIiFEb1L0LouWmey0Qiia5PccbhgkiWC9Mz0maN1DF2', 'ludoviclaisnez@gmail.com', b'0', 'Ludovic', '$2a$10$75WBIwcSOjSIiFEb1L0LouWmey0Qiia5PccbhgkiWC9Mz0maN1DF2', 'LAISNEZ'),
('marcel', '2022-07-20 06:28:38', '2022-07-20 07:01:50', '$2a$10$qXcmBUpU.1KqC8uRMf9PSeAbEFuZAdFz/0n09W60LaPdOuPjLQMUO', 'marcel@gmail.com', b'0', 'Marcelino', '$2a$10$qXcmBUpU.1KqC8uRMf9PSeAbEFuZAdFz/0n09W60LaPdOuPjLQMUO', 'GAFOTAS'),
('mickael2000', '2022-07-20 06:44:57', '2022-07-20 07:02:07', '$2a$10$BIGJt/jPHozW0JSTy7D.HueMxRQM1TvO1DgivUkOP84laDvsu3CN2', 'micky@gmail.com', b'0', 'Mickael', '$2a$10$BIGJt/jPHozW0JSTy7D.HueMxRQM1TvO1DgivUkOP84laDvsu3CN2', 'NIGHT'),
('miguel1955', '2022-07-20 06:30:32', '2022-07-20 07:02:34', '$2a$10$m558gnuW6L6VJ4.2suOYUuT41xxo5xiMME9NZgNcivEsxhb.g4DiO', 'migang@gmail.com', b'0', 'Miguel ángel', '$2a$10$m558gnuW6L6VJ4.2suOYUuT41xxo5xiMME9NZgNcivEsxhb.g4DiO', 'AROZAMENA');

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
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Truncar tablas antes de insertar `user_book`
--

TRUNCATE TABLE `user_book`;
--
-- Volcado de datos para la tabla `user_book`
--

INSERT DELAYED INTO `user_book` (`user_id`, `book_id`) VALUES
('marcel', 4),
('marcel', 5),
('mickael2000', 9),
('mickael2000', 10),
('mickael2000', 1),
('ludo1974', 4),
('miguel1955', 4);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `book`
--
ALTER TABLE `book`
  ADD CONSTRAINT `FKcpa3bj39l5v3136txpissgppm` FOREIGN KEY (`cat_id`) REFERENCES `category` (`id`);

--
-- Filtros para la tabla `role`
--
ALTER TABLE `role`
  ADD CONSTRAINT `FK13nv3h965w27i114ylfgt9b4d` FOREIGN KEY (`username`) REFERENCES `user` (`username`);

--
-- Filtros para la tabla `user_book`
--
ALTER TABLE `user_book`
  ADD CONSTRAINT `FK85pwltn867pjxog1gk5smtqcw` FOREIGN KEY (`book_id`) REFERENCES `book` (`id`),
  ADD CONSTRAINT `FKbc0bwdnndnxhct38sinbem0n0` FOREIGN KEY (`user_id`) REFERENCES `user` (`username`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
