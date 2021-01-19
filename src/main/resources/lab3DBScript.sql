CREATE SCHEMA IF NOT EXISTS `kit` ;
USE `kit` ;

DROP TABLE IF EXISTS `advertisment_panel_has_advertisment`;
DROP TABLE IF EXISTS `supermarket_has_section`;
DROP TABLE IF EXISTS `advertisment`;
DROP TABLE IF EXISTS `trade_network_has_supermarket`;
DROP TABLE IF EXISTS `trade_network`;
DROP TABLE IF EXISTS `supermarket`;
DROP TABLE IF EXISTS `house`;
DROP TABLE IF EXISTS `street`;
DROP TABLE IF EXISTS `city`;
DROP TABLE IF EXISTS `advertisment_panel`;
DROP TABLE IF EXISTS `section`;

CREATE TABLE IF NOT EXISTS `section` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(30) NOT NULL,
  PRIMARY KEY (`id`));

CREATE TABLE IF NOT EXISTS `advertisment_panel` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `producer` VARCHAR(30) NOT NULL,
  `screen_resolution` VARCHAR(20) NOT NULL,
  `consuming_power_amount_in_wats` INT NOT NULL,
  `section_id` INT NOT NULL,
  `number_of_panels` INT NULL,
  PRIMARY KEY (`id`),
  INDEX `advertisment_panel_section_idx` (`section_id`));

CREATE TABLE IF NOT EXISTS `city` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(30) NOT NULL,
  PRIMARY KEY (`id`));

CREATE TABLE IF NOT EXISTS `street` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `city_id` INT NOT NULL,
  `name` VARCHAR(30) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `street_city_idx` (`city_id`));

CREATE TABLE IF NOT EXISTS `house` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `street_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `house_street_idx` (`street_id`));

CREATE TABLE IF NOT EXISTS `supermarket` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `house_id` INT NOT NULL,
  `description` VARCHAR(50) NULL,
  `area_size_in_meters` INT NOT NULL,
  `work_scheudle_start` TIME NOT NULL,
  `work_scheudle_end` TIME NOT NULL,
  `average_customers_amount` INT NULL,
  FOREIGN KEY (`house_id`) REFERENCES `house`(`id`),
  PRIMARY KEY (`id`));

CREATE TABLE IF NOT EXISTS `kit`.`trade_network` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(40) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `name_UNIQUE_idx` (`name`));

CREATE TABLE IF NOT EXISTS `trade_network_has_supermarket` (
    `id` INT NOT NULL AUTO_INCREMENT,
  `trade_network_id` INT NOT NULL,
  `supermarket_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `trade-network_has_supermarket_idx` (`supermarket_id`),
  INDEX `supermarket_has_trade-network_idx` (`trade_network_id`));

CREATE TABLE IF NOT EXISTS `advertisment` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `description` VARCHAR(45) NULL,
  `producer` VARCHAR(45) NOT NULL,
  `duration` TIME NOT NULL,
  `trade_network_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `advertisment_trade-network_idx` (`trade_network_id`));

CREATE TABLE IF NOT EXISTS `supermarket_has_section` (
    `id` INT NOT NULL AUTO_INCREMENT,
  `supermarket_id` INT NOT NULL,
  `section_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `supermarket_has_section_idx` (`section_id`),
  INDEX `section_has_supermarket_idx` (`supermarket_id`));


CREATE TABLE IF NOT EXISTS `advertisment_panel_has_advertisment` (
    `id` INT NOT NULL AUTO_INCREMENT,
  `advertisment_panel_id` INT NOT NULL,
  `advertisment_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `advertisment_panel_has_advertismentidx` (`advertisment_id`),
  INDEX `advertisment_has_advertisment_panel_idx` (`advertisment_panel_id`));

ALTER TABLE `advertisment_panel`
    ADD FOREIGN KEY (`section_id`)
    REFERENCES `section` (`id`);
    
ALTER TABLE `trade_network_has_supermarket`
    ADD FOREIGN KEY (`trade_network_id`)
    REFERENCES `trade_network` (`id`),
    ADD FOREIGN KEY (`supermarket_id`)
    REFERENCES `supermarket` (`id`);
    
ALTER TABLE `advertisment`
    ADD FOREIGN KEY (`trade_network_id`)
    REFERENCES `trade_network` (`id`);
    
ALTER TABLE `supermarket_has_section`
    ADD FOREIGN KEY (`supermarket_id`)
    REFERENCES `supermarket` (`id`),
    ADD FOREIGN KEY (`section_id`)
    REFERENCES `section` (`id`);
    
ALTER TABLE `advertisment_panel_has_advertisment`
    ADD FOREIGN KEY (`advertisment_panel_id`)
    REFERENCES `advertisment_panel` (`id`),
    ADD FOREIGN KEY (`advertisment_id`)
    REFERENCES `advertisment` (`id`);
    
ALTER TABLE `kit`.`street`
    ADD FOREIGN KEY (`city_id`)
    REFERENCES `kit`.`city` (`id`);
    
ALTER TABLE `house`
    ADD FOREIGN KEY (`street_id`)
    REFERENCES `street` (`id`);
    
CREATE INDEX section_name_idx ON section(name);
CREATE INDEX city_name_idx ON city(name);

INSERT INTO `section`(`name`)
	VALUES ("chuvash"),
    ("qwe"),
    ("ok"),
    ("ya"),
    ("web"),
    ("developer"),
    ("ladno"),
    ("db"),
    ("ok"),
    ("what");
    
INSERT INTO `advertisment_panel`(`producer`,`screen_resolution`,`consuming_power_amount_in_wats`,
`section_id`,`number_of_panels`)
	VALUES ("vlad","1680x1050","250","1","2"),
    ("dimon","1920x1080","150","2","3"),
    ("pavlo","1940x1080","350","3","4"),
    ("osada","1960x1080","450","4","5"),
    ("poe","1980x1080","170","5","6"),
    ("not a producer","2000x1080","270","6","7"),
    ("shavuch","2020x1080","10","7","8"),
    ("myname","2040x1080","15","8","9"),
    ("yourname","2060x1080","50","9","10"),
    ("ourname","2080x1080","1500","10","11");

INSERT INTO `city`(`name`)
	VALUES ("lviv"),
    ("krakiv"),
    ("kyiv"),
    ("anothercity"),
    ("text"),
    ("bottomtext"),
    ("uppertext"),
    ("chuvash"),
    ("vachush"),
    ("ok");
    
INSERT INTO `street`(`city_id`,`name`)
	VALUES ("1","st"),
    ("2","myst"),
    ("3","chuvash"),
    ("4","bandery"),
    ("5","iot"),
    ("6","marko"),
    ("7","vlad"),
    ("8","davl"),
    ("9","dimon"),
    ("10","oleg");
    
INSERT INTO `house`(`street_id`)
	VALUES ("1"),
    ("2"),
    ("3"),
    ("4"),
    ("5"),
    ("6"),
    ("7"),
    ("8"),
    ("9"),
    ("10");

INSERT INTO `supermarket`(`house_id`,`description`,`area_size_in_meters`,
`work_scheudle_start`,`work_scheudle_end`,`average_customers_amount`)
	VALUES ("1","scription","251","07:30:00","21:30:00","850"),
    ("2","ok","252","08:30:00","18:30:00","750"),
    ("3","text","51","07:30:00","17:30:00","950"),
    ("4","toptext","253","09:30:00","16:30:00","1850"),
    ("5","bottomtext","254","10:30:00","18:15:00","650"),
    ("6","middletext","255","09:30:00","22:30:00","550"),
    ("7","uppertoptext","256","08:30:00","21:30:00","8250"),
    ("8","upperdowntext","257","07:30:00","16:30:00","2850"),
    ("9","yourtext","258","07:30:00","15:30:00","3850"),
    ("10","mytext","259","07:30:00","14:30:00","4850");

INSERT INTO `trade_network`(`name`)
	VALUES ("marko"),
    ("ymnuy"),
    ("web"),
    ("developer"),
    ("anton"),
    ("toje"),
    ("ladno"),
    ("db"),
    ("pochemy"),
    ("why");

INSERT INTO `trade_network_has_supermarket`(`trade_network_id`,`supermarket_id`)
	VALUES ("1","1"),
    ("2","2"),
    ("3","3"),
    ("4","4"),
    ("5","5"),
    ("6","6"),
    ("7","7"),
    ("8","8"),
    ("9","9"),
    ("10","10");

INSERT INTO `advertisment` (`description`,`producer`,`duration`,`trade_network_id`)
	VALUES ("desc","vlad","00:03:00","1"),
    ("riptions","dimon","00:30:00","2"),
    ("scription","osada","00:10:00","3"),
    ("ondescript","pavlo","00:15:00","4"),
    ("deonscript","chuvash","01:30:00","5"),
    ("pirsction","roman","00:01:00","6"),
    ("opetrds","maran","00:02:00","7"),
    ("whyme","archik","00:02:30","8"),
    ("mytext","prodigy","00:01:45","9"),
    ("text","pradyucer","00:05:00","10");
    
INSERT INTO `supermarket_has_section`(`supermarket_id`,`section_id`)
	VALUES ("1","1"),
    ("2","2"),
    ("3","3"),
    ("4","4"),
    ("5","5"),
    ("6","6"),
    ("7","7"),
    ("8","8"),
    ("9","9"),
    ("10","10");

INSERT INTO `advertisment_panel_has_advertisment`(`advertisment_panel_id`,`advertisment_id`)
	VALUES ("1","1"),
    ("2","2"),
    ("3","3"),
    ("4","4"),
    ("5","5"),
    ("6","6"),
    ("7","7"),
    ("8","8"),
    ("9","9"),
    ("10","10");
    
