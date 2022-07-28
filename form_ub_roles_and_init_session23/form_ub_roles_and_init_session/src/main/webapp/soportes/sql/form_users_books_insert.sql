INSERT INTO `book` (`id`, `author`, `title`, `cat_id`) VALUES
(1, 'Jules Vernes', '20000 lieues sous les mers', 1),
(2, 'Jacques Verber', 'Les fourmis', 1),
(3, 'Victor Hugo', 'Les misérables', 2),
(4, 'Stephen King', 'Cujo', 1),
(5, 'La Fontaine', 'Les Fables', 6),
(6, 'George Sand', 'La petite Fadette', 5),
(7, 'George Sand', 'Histoire de ma vie', 5),
(8, 'Guy de Maupassant', 'Bel ami', 5),
(9, 'François Rabelais', 'Gargantua et Pantagruel', 2),
(10, 'François Rabelais', 'Troisième livre de Pantagruel', 5),
(11, 'Voltaire', 'Bruto', 1),
(12, 'Gustave Flaubert', 'Madame de Bovary', 1),
(13, 'Jules Vernes', 'Voyage au centre de la terre', 1),
(14, 'Jules Vernes', 'Le tour du monde en 80 jours', 1),
(15, 'Molière', 'Les femmes savantes', 3),
(16, 'Molière', 'Le bourgeois gentilhomme', 3),
(17, 'Molière', 'L\'avare', 3);

INSERT INTO `book_details` (`id`, `page_number`, `publication_year`, `purchase_year`) VALUES
(1, 205, 1883, 2001),
(2, 208, 1985, 2001),
(3, 450, 1878, 2005),
(4, 380, 1985, 2005),
(5, 205, 1555, 1980),
(6, 180, 1849, 2001),
(7, 205, 1855, 2003),
(8, 206, 1885, 1975),
(9, 250, 1532, 1975),
(10, 180, 1546, 1975),
(11, 210, 1730, 1975),
(12, 300, 1856, 1975),
(13, 290, 1864, 1990),
(14, 320, 1872, 1990),
(15, 180, 1577, 1975),
(16, 170, 1578, 1990),
(17, 160, 1575, 1990);


INSERT INTO `category` (`id`, `category_name`) VALUES
(1, 'Aventuras'),
(2, 'Bibliografía'),
(3, 'Teatro'),
(4, 'Terror'),
(5, 'Novela'),
(6, 'Fábulas');

INSERT INTO `user` (`id`, `email`, `name`) VALUES
(1, 'ludoviclaisnez@gmail.com', 'Ludovic'),
(2, 'm.pilar.ar78@gmail.com', 'María'),
(3, 'hector@gmail.com', 'HECTOR');

INSERT INTO `user_book` (`user_id`, `book_id`) VALUES
(1, 2),
(1, 3),
(2, 10),
(3, 4);