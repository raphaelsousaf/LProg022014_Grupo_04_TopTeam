-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 25-Nov-2014 às 21:50
-- Versão do servidor: 5.6.21
-- PHP Version: 5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `stopcar`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `cliente`
--

CREATE TABLE IF NOT EXISTS `cliente` (
`idcliente` int(11) NOT NULL,
  `nome` varchar(80) DEFAULT NULL,
  `cpf` varchar(15) DEFAULT NULL,
  `telefone` varchar(45) DEFAULT NULL,
  `endereco` varchar(120) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `cliente`
--

INSERT INTO `cliente` (`idcliente`, `nome`, `cpf`, `telefone`, `endereco`) VALUES
(1, 'Rafael', '001.475.098-30', '(61) 8477 - 7159', 'Qr 252 Conj. 03 Casa 22'),
(2, 'Yasser ', '002.876.950-34', '(61) 4785 - 4785', 'dc');

-- --------------------------------------------------------

--
-- Estrutura da tabela `estacionamento`
--

CREATE TABLE IF NOT EXISTS `estacionamento` (
`idestacionamento` int(11) NOT NULL,
  `hora_entrada` time DEFAULT NULL,
  `data_entrada` date DEFAULT NULL,
  `veículo_idveículo` int(11) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `estacionamento`
--

INSERT INTO `estacionamento` (`idestacionamento`, `hora_entrada`, `data_entrada`, `veículo_idveículo`) VALUES
(1, '22:10:00', '2014-10-16', 1),
(2, '13:30:00', '2014-10-14', 2);

-- --------------------------------------------------------

--
-- Estrutura da tabela `total`
--

CREATE TABLE IF NOT EXISTS `total` (
`idtotal` int(11) NOT NULL,
  `total` float DEFAULT NULL,
  `data_saida` date DEFAULT NULL,
  `hora_saida` time DEFAULT NULL,
  `valor_hora` float DEFAULT NULL,
  `estacionamento_idestacionamento` int(11) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `total`
--

INSERT INTO `total` (`idtotal`, `total`, `data_saida`, `hora_saida`, `valor_hora`, `estacionamento_idestacionamento`) VALUES
(1, NULL, '2014-10-20', '14:45:00', 2, 1);

-- --------------------------------------------------------

--
-- Estrutura da tabela `veículo`
--

CREATE TABLE IF NOT EXISTS `veículo` (
`idveículo` int(11) NOT NULL,
  `tipo` varchar(45) DEFAULT NULL,
  `placa` varchar(20) DEFAULT NULL,
  `cor` varchar(45) DEFAULT NULL,
  `descricao` varchar(150) DEFAULT NULL,
  `cliente_idcliente` int(11) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `veículo`
--

INSERT INTO `veículo` (`idveículo`, `tipo`, `placa`, `cor`, `descricao`, `cliente_idcliente`) VALUES
(1, 'Moto', 'JOK4885', 'Vermelha', 'egad', 1),
(2, 'Carro', 'HGB3456', 'Rosa', ' o Carro!', 2);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cliente`
--
ALTER TABLE `cliente`
 ADD PRIMARY KEY (`idcliente`);

--
-- Indexes for table `estacionamento`
--
ALTER TABLE `estacionamento`
 ADD PRIMARY KEY (`idestacionamento`), ADD KEY `fk_estacionamento_veículo1_idx` (`veículo_idveículo`);

--
-- Indexes for table `total`
--
ALTER TABLE `total`
 ADD PRIMARY KEY (`idtotal`), ADD KEY `fk_total_estacionamento1_idx` (`estacionamento_idestacionamento`);

--
-- Indexes for table `veículo`
--
ALTER TABLE `veículo`
 ADD PRIMARY KEY (`idveículo`), ADD KEY `fk_veículo_cliente_idx` (`cliente_idcliente`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cliente`
--
ALTER TABLE `cliente`
MODIFY `idcliente` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `estacionamento`
--
ALTER TABLE `estacionamento`
MODIFY `idestacionamento` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `total`
--
ALTER TABLE `total`
MODIFY `idtotal` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `veículo`
--
ALTER TABLE `veículo`
MODIFY `idveículo` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
--
-- Constraints for dumped tables
--

--
-- Limitadores para a tabela `estacionamento`
--
ALTER TABLE `estacionamento`
ADD CONSTRAINT `fk_estacionamento_veículo1` FOREIGN KEY (`veículo_idveículo`) REFERENCES `veículo` (`idveículo`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Limitadores para a tabela `total`
--
ALTER TABLE `total`
ADD CONSTRAINT `fk_total_estacionamento1` FOREIGN KEY (`estacionamento_idestacionamento`) REFERENCES `estacionamento` (`idestacionamento`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Limitadores para a tabela `veículo`
--
ALTER TABLE `veículo`
ADD CONSTRAINT `fk_veículo_cliente` FOREIGN KEY (`cliente_idcliente`) REFERENCES `cliente` (`idcliente`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
