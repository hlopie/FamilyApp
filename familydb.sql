-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Czas generowania: 03 Gru 2022, 18:26
-- Wersja serwera: 10.4.22-MariaDB
-- Wersja PHP: 8.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Baza danych: `familydb`
--

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `family`
--

CREATE TABLE `family` (
  `familyName` varchar(45) NOT NULL,
  `id` int(11) NOT NULL,
  `nrOfAdults` int(11) NOT NULL,
  `nrOfChildren` int(11) NOT NULL,
  `nrOfInfants` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Zrzut danych tabeli `family`
--

INSERT INTO `family` (`familyName`, `id`, `nrOfAdults`, `nrOfChildren`, `nrOfInfants`) VALUES
('Nowaki', 5, 2, 1, '1'),
('Dudowie', 6, 2, 0, '3'),
('Bobrzańscy', 7, 3, 2, '0');

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `familymember`
--

CREATE TABLE `familymember` (
  `familyID` int(11) NOT NULL,
  `familyName` varchar(45) NOT NULL,
  `givenName` varchar(45) NOT NULL,
  `id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Zrzut danych tabeli `familymember`
--

INSERT INTO `familymember` (`familyID`, `familyName`, `givenName`, `id`) VALUES
(5, 'Nowaki', 'Kamil', 1),
(5, 'Nowaki', 'Basia', 2),
(5, 'Nowaki', 'Kasia', 3),
(5, 'Nowaki', 'Asia', 4),
(6, 'Dudowie', 'Michał', 5),
(6, 'Dudowie', 'Romania', 6),
(6, 'Dudowie', 'Gosia', 7),
(6, 'Dudowie', 'Grażynka', 8);

--
-- Indeksy dla zrzutów tabel
--

--
-- Indeksy dla tabeli `family`
--
ALTER TABLE `family`
  ADD PRIMARY KEY (`id`);

--
-- Indeksy dla tabeli `familymember`
--
ALTER TABLE `familymember`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT dla zrzuconych tabel
--

--
-- AUTO_INCREMENT dla tabeli `family`
--
ALTER TABLE `family`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT dla tabeli `familymember`
--
ALTER TABLE `familymember`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
