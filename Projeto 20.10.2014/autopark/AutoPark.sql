SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL';

DROP SCHEMA IF EXISTS `mydb` ;
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci ;
SHOW WARNINGS;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `Veiculo`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Veiculo` ;

SHOW WARNINGS;
CREATE  TABLE IF NOT EXISTS `Veiculo` (
  `idVeiculo` INT NULL ,
  `Placa` VARCHAR(9) NOT NULL ,
  `Marca` VARCHAR(30) NULL ,
  `Tipo` VARCHAR(12) NULL ,
  PRIMARY KEY (`idVeiculo`, `Placa`) )
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `Financeiro`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Financeiro` ;

SHOW WARNINGS;
CREATE  TABLE IF NOT EXISTS `Financeiro` (
  `Horarioe` TIME NOT NULL ,
  `Horarios` TIME NOT NULL ,
  `Dia` DATETIME NOT NULL ,
  `TipoVeiculo` VARCHAR(10) NULL ,
  `Veiculo_idVeiculo` INT NOT NULL ,
  `Veiculo_Placa` VARCHAR(9) NOT NULL ,
  `Pernoite` CHAR NULL )
ENGINE = InnoDB;

SHOW WARNINGS;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
