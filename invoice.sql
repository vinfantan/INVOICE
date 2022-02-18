-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Feb 18, 2022 at 02:26 PM
-- Server version: 5.7.23
-- PHP Version: 7.2.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `invoice`
--

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
CREATE TABLE IF NOT EXISTS `customer` (
  `Sno` int(11) NOT NULL AUTO_INCREMENT,
  `cname` varchar(150) NOT NULL,
  `phone` varchar(10) NOT NULL,
  `address` varchar(300) NOT NULL,
  `pdfname` varchar(60) NOT NULL,
  PRIMARY KEY (`Sno`)
) ENGINE=MyISAM AUTO_INCREMENT=14 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`Sno`, `cname`, `phone`, `address`, `pdfname`) VALUES
(1, 'vhvhjvm', 'vhmjb', 'cmhkvmv', 'hckvj,b ,j'),
(2, '', '', '', '02-01-2020  16~19~34.pdf'),
(3, 'vivek', '543154651', 'hvbjk, k.n.l', '02-01-2020  16~53~04.pdf'),
(4, 'vvivewfw', '542', 'wjnkle\nvwjvbjl\nwninerk', '02-01-2020  18~34~25.pdf'),
(5, 'n jk', '6453214835', '9+566\nhiukhnbjk\nbjjkm,', '02-01-2020  21~44~03.pdf'),
(6, '', '', '', '02-01-2020  21~51~05.pdf'),
(7, 'klbhgh', '26523262', 'vuikjb \nnbyfiuk \nnbhgsytguj \nmnbvfiu', '02-01-2020  21~56~13.pdf'),
(8, 'hjbjh', '', '', '03-01-2020  12~13~06.pdf'),
(9, 'vhihuhi', '4586569', 'hjbjk \nmiuhio\nhiojo', '15-03-2020  09~51~13.pdf'),
(10, 'vivek gupta', '45585', 'gvhyjbjnuh\njjik', '22-03-2020  21~05~24.pdf'),
(11, '', '', '', '16-09-2020  17~01~24.pdf'),
(12, '', '', '', '17-02-2021  11~12~34.pdf'),
(13, 'bjkhk', '231432', ',jkbhjoljkn.,', '09-07-2021  19~25~14.pdf');

-- --------------------------------------------------------

--
-- Table structure for table `items`
--

DROP TABLE IF EXISTS `items`;
CREATE TABLE IF NOT EXISTS `items` (
  `itemname` varchar(200) NOT NULL,
  `price` varchar(20) NOT NULL,
  `GST` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `items`
--

INSERT INTO `items` (`itemname`, `price`, `GST`) VALUES
('vivek kumar', '0.0', '0.0'),
('nv hb jm,b ,m', '4565312.', '41531.'),
('g hb jm m,', '4532', '212.'),
('mn ,m ,m', '154152', '2123.'),
('mnkml,;/', '1220', '122.00'),
('b,n ,m ', '2420', '2120'),
('bbcb', '666', '6'),
('uhivds', '7851.022', '02.023'),
('fewjn', '515', '223'),
('opqw', '5312', '132'),
('ve n ke,', '5662', '62'),
('weecea  m,zmlm,rwz', '2212', '20.23'),
('lsp c gyuerrt', '56232', '65'),
('xmcxslf rff', '2330.', '30'),
('skvnelk mrglekv', '5132', '51'),
('etyewer rehi oer', '212', '2132'),
(' m k,m l', '8452', '653'),
('fvgbhjn', '859.526', '0.0'),
('guih', '79484', '54'),
('ghbhj', '454', '11'),
('hui', '26263', '562652'),
('nm,nk,', '65', '4');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
