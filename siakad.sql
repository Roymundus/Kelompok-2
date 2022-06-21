-- phpMyAdmin SQL Dump
-- version 5.1.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 21 Jun 2022 pada 07.59
-- Versi server: 10.4.24-MariaDB
-- Versi PHP: 7.4.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `siakad`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `dataguru`
--

CREATE TABLE `dataguru` (
  `nama` text NOT NULL,
  `nip` varchar(18) NOT NULL,
  `jenis_kelamin` text NOT NULL,
  `status` text NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `notelp` varchar(13) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `dataguru`
--

INSERT INTO `dataguru` (`nama`, `nip`, `jenis_kelamin`, `status`, `alamat`, `notelp`) VALUES
('Rell', '09128390128312', 'Laki-laki', 'Honorer', 'Jl. Pelayaran Rt. 10 No. 36', '083140682041'),
('Muhammad Erlangga', '198609262015051001', 'Laki-laki', 'ASN', 'Balikpapan Utara, Baikpapan, Kalimantan Timur', '085266127946');

-- --------------------------------------------------------

--
-- Struktur dari tabel `datanilai`
--

CREATE TABLE `datanilai` (
  `nama` varchar(50) NOT NULL,
  `kelas` text NOT NULL,
  `nis` int(15) NOT NULL,
  `agama` int(3) NOT NULL,
  `ipa` int(3) NOT NULL,
  `ips` int(3) NOT NULL,
  `b_indo` int(3) NOT NULL,
  `b_ing` int(3) NOT NULL,
  `matematika` int(3) NOT NULL,
  `pkn` int(3) NOT NULL,
  `penjas_orkes` int(3) NOT NULL,
  `sbk` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Struktur dari tabel `datasiswa`
--

CREATE TABLE `datasiswa` (
  `nama` varchar(50) NOT NULL,
  `nis` varchar(13) NOT NULL,
  `kelas` text NOT NULL,
  `nama_ayah` varchar(50) NOT NULL,
  `nama_ibu` varchar(50) NOT NULL,
  `alamat` varchar(100) NOT NULL,
  `tempat_tanggal_lahir` varchar(30) NOT NULL,
  `agama` varchar(30) NOT NULL,
  `jenis-kelamin` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `datasiswa`
--

INSERT INTO `datasiswa` (`nama`, `nis`, `kelas`, `nama_ayah`, `nama_ibu`, `alamat`, `tempat_tanggal_lahir`, `agama`, `jenis-kelamin`) VALUES
('Darrell Timothy Nasarany', '11211029', 'KELAS 6', 'oajdwidjaod', 'jiadajdwjdwa', 'Jl. Pelayaran RT. 10 NO. 36', 'Balikpapan, 29-09-2003', 'Kristen', 'LAKI-LAKI');

-- --------------------------------------------------------

--
-- Struktur dari tabel `login`
--

CREATE TABLE `login` (
  `username` varchar(16) NOT NULL,
  `password` varchar(8) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `login`
--

INSERT INTO `login` (`username`, `password`) VALUES
('admin', 'admin');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
