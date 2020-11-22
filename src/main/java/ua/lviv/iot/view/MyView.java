package ua.lviv.iot.view;

import ua.lviv.iot.controller.*;
import ua.lviv.iot.model.entity.*;

import java.sql.SQLException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MyView {

    private final AdvertismentController advertismentController = new AdvertismentController();
    private final AdvertismentPanelController advertismentPanelController = new AdvertismentPanelController();
    private final CityController cityController = new CityController();
    private final HouseController houseController = new HouseController();
    private final SectionController sectionController = new SectionController();
    private final StreetController streetController = new StreetController();
    private final SupermarketController supermarketController = new SupermarketController();
    private final TradeNetworkController tradeNetworkController = new TradeNetworkController();

    private Map<String, String> menu;
    private Map<String, Printable> methodsMenu;
    private static final Scanner INPUT = new Scanner(System.in);

    public MyView(){
        menu = new LinkedHashMap<>();
        methodsMenu = new LinkedHashMap<>();

        menu.put("Q", "Q - exit program");
        menu.put("S", "S - show menu");


        menu.put("1", "\n1 - Get all sections");
        menu.put("2", "2 - Get section by ID");
        menu.put("3", "3 - Create section");
        menu.put("4", "4 - Delete section");
        menu.put("5", "5 - Update section\n");

        menu.put("6", "6 - Get all advertisment panels");
        menu.put("7", "7 - Get advertisment panel by ID");
        menu.put("8", "8 - Create advertisment panel");
        menu.put("9", "9 - Delete advertisment panel");
        menu.put("10", "10 - Update advertisment panel\n");

        menu.put("11", "11 - Get all cities");
        menu.put("12", "12 - Get city by ID");
        menu.put("13", "13 - Create city");
        menu.put("14", "14 - Delete city");
        menu.put("15", "15 - Update city\n");

        menu.put("16", "16 - Get all streets");
        menu.put("17", "17 - Get street by ID");
        menu.put("18", "18 - Create street");
        menu.put("19", "19 - Delete street");
        menu.put("20", "20 - Update street\n");

        menu.put("21", "21 - Get all houses");
        menu.put("22", "22 - Get house by ID");
        menu.put("23", "23 - Create house");
        menu.put("24", "24 - Delete house");
        menu.put("25", "25 - Update house\n");

        menu.put("26", "26 - Get all supermarkets");
        menu.put("27", "27 - Get supermarket by ID");
        menu.put("28", "28 - Create supermarket");
        menu.put("29", "29 - Delete supermarket");
        menu.put("30", "30 - Update supermarket\n");

        menu.put("31", "31 - Get all trade networks");
        menu.put("32", "32 - Get trade networks by ID");
        menu.put("33", "33 - Create trade network");
        menu.put("34", "34 - Delete trade network");
        menu.put("35", "35 - Update trade network\n");

        menu.put("36", "36 - Get all advertisments");
        menu.put("37", "37 - Get advertisment by ID");
        menu.put("38", "38 - Create advertisment");
        menu.put("39", "39 - Delete advertisment");
        menu.put("40", "40 - Update advertisment\n");

        methodsMenu.put("S", this::showMenu);


        methodsMenu.put("1", this::getAllSections);
        methodsMenu.put("2", this::getSectionById);
        methodsMenu.put("3", this::createSection);
        methodsMenu.put("4", this::deleteSection);
        methodsMenu.put("5", this::updateSection);

        methodsMenu.put("6", this::getAllAdvertismentPanels);
        methodsMenu.put("7", this::getAdvertismentPanelById);
        methodsMenu.put("8", this::createAdvertismentPanel);
        methodsMenu.put("9", this::deleteAdvertismentPanel);
        methodsMenu.put("10", this::updateAdvertismentPanel);

        methodsMenu.put("11", this::getAllCities);
        methodsMenu.put("12", this::getCityById);
        methodsMenu.put("13", this::createCity);
        methodsMenu.put("14", this::deleteCity);
        methodsMenu.put("15", this::updateCity);

        methodsMenu.put("16", this::getAllStreets);
        methodsMenu.put("17", this::getStreetById);
        methodsMenu.put("18", this::createStreet);
        methodsMenu.put("19", this::deleteStreet);
        methodsMenu.put("20", this::updateStreet);

        methodsMenu.put("21", this::getAllHouses);
        methodsMenu.put("22", this::getHouseById);
        methodsMenu.put("23", this::createHouse);
        methodsMenu.put("24", this::deleteHouse);
        methodsMenu.put("25", this::updateHouse);

        methodsMenu.put("26", this::getAllSupermarkets);
        methodsMenu.put("27", this::getSupermarketById);
        methodsMenu.put("28", this::createSupermarket);
        methodsMenu.put("29", this::deleteSupermarket);
        methodsMenu.put("30", this::updateSupermarket);

        methodsMenu.put("31", this::getAllTradeNetworks);
        methodsMenu.put("32", this::getTradeNetworkById);
        methodsMenu.put("33", this::createTradeNetwork);
        methodsMenu.put("34", this::deleteTradeNetwork);
        methodsMenu.put("35", this::updateTradeNetwork);

        methodsMenu.put("36", this::getAllAdvertisments);
        methodsMenu.put("37", this::getAdvertismentById);
        methodsMenu.put("38", this::createAdvertisment);
        methodsMenu.put("39", this::deleteAdvertisment);
        methodsMenu.put("40", this::updateAdvertisment);

    }

    private void getAllSections() throws SQLException {
        System.out.println("\nSections:\n");
        System.out.println(sectionController.getAll());
    }

    private void getSectionById() throws SQLException {
        System.out.println("\nEnter ID for section");
        int id = INPUT.nextInt();
        System.out.println(sectionController.getBy(id));
    }

    private void deleteSection() throws SQLException {
        System.out.println("\nEnter ID for an section you want to delete");
        int id = INPUT.nextInt();
        System.out.println(sectionController.delete(id));
    }

    private void createSection() throws SQLException {
        System.out.println("\nEnter name");
        String name = INPUT.next();
        Section section = new Section(name);
        System.out.println(sectionController.create(section));
    }

    private void updateSection() throws SQLException {
        System.out.println("\nEnter ID");
        int id = INPUT.nextInt();
        System.out.println("\nEnter name");
        String name = INPUT.next();
        Section updatedSection = new Section(id, name);
        System.out.println(sectionController.update(updatedSection));
    }

    private void getAllAdvertismentPanels() throws SQLException {
        System.out.println("\nAdvertisment panels:\n");
        System.out.println(advertismentPanelController.getAll());
    }

    private void getAdvertismentPanelById() throws SQLException {
        System.out.println("\nEnter ID for advertisment panel");
        int id = INPUT.nextInt();
        System.out.println(advertismentPanelController.getBy(id));
    }

    private void deleteAdvertismentPanel() throws SQLException {
        System.out.println("\nEnter ID for an advertisment panel you want to delete");
        int id = INPUT.nextInt();
        System.out.println(advertismentPanelController.delete(id));
    }

    private void createAdvertismentPanel() throws SQLException {
        System.out.println("\nEnter producer");
        String producer = INPUT.next();
        System.out.println("\nEnter screen resolution");
        String resolution = INPUT.next();
        System.out.println("\nEnter consuming power in wats");
        Integer power = INPUT.nextInt();
        System.out.println("\nEnter section id");
        Integer sectionId = INPUT.nextInt();
        System.out.println("\nEnter number of panels");
        Integer numberOfPanels = INPUT.nextInt();
        AdvertismentPanel advertismentPanel = new AdvertismentPanel(producer, resolution, power, sectionId, numberOfPanels);
        System.out.println(advertismentPanelController.create(advertismentPanel));
    }

    private void updateAdvertismentPanel() throws SQLException {
        System.out.println("\nEnter ID");
        int id = INPUT.nextInt();
        System.out.println("\nEnter producer");
        String producer = INPUT.next();
        System.out.println("\nEnter screen resolution");
        String resolution = INPUT.next();
        System.out.println("\nEnter consuming power in wats");
        Integer power = INPUT.nextInt();
        System.out.println("\nEnter section id");
        Integer sectionId = INPUT.nextInt();
        System.out.println("\nEnter number of panels");
        Integer numberOfPanels = INPUT.nextInt();
        AdvertismentPanel updatedPanel = new AdvertismentPanel(id, producer, resolution, power, sectionId, numberOfPanels);
        System.out.println(advertismentPanelController.update(updatedPanel));
    }

    private void getAllCities() throws SQLException {
        System.out.println("\nCities:\n");
        System.out.println(cityController.getAll());
    }

    private void getCityById() throws SQLException {
        System.out.println("\nEnter ID for city");
        int id = INPUT.nextInt();
        System.out.println(cityController.getBy(id));
    }

    private void deleteCity() throws SQLException {
        System.out.println("\nEnter ID for a city you want to delete");
        int id = INPUT.nextInt();
        System.out.println(cityController.delete(id));
    }

    private void createCity() throws SQLException {
        System.out.println("\nEnter name");
        String name = INPUT.next();
        City city = new City(name);
        System.out.println(cityController.create(city));
    }

    private void updateCity() throws SQLException {
        System.out.println("\nEnter ID");
        int id = INPUT.nextInt();
        System.out.println("\nEnter name");
        String name = INPUT.next();
        City updatedCity = new City(id, name);
        System.out.println(cityController.update(updatedCity));
    }

    private void getAllStreets() throws SQLException {
        System.out.println("\nStreets:\n");
        System.out.println(streetController.getAll());
    }

    private void getStreetById() throws SQLException {
        System.out.println("\nEnter ID for street");
        int id = INPUT.nextInt();
        System.out.println(streetController.getBy(id));
    }

    private void deleteStreet() throws SQLException {
        System.out.println("\nEnter ID for a street you want to delete");
        int id = INPUT.nextInt();
        System.out.println(streetController.delete(id));
    }

    private void createStreet() throws SQLException {
        System.out.println("\nEnter city id for street");
        Integer cityId = INPUT.nextInt();
        System.out.println("\nEnter name");
        String name = INPUT.next();
        Street street = new Street(cityId, name);
        System.out.println(streetController.create(street));
    }

    private void updateStreet() throws SQLException {
        System.out.println("\nEnter ID");
        int id = INPUT.nextInt();
        System.out.println("\nEnter name");
        String name = INPUT.next();
        System.out.println("\nEnter city id for street");
        Integer cityId = INPUT.nextInt();
        Street updatedStreet = new Street(id, cityId, name);
        System.out.println(streetController.update(updatedStreet));
    }

    private void getAllHouses() throws SQLException {
        System.out.println("\nHouses:\n");
        System.out.println(houseController.getAll());
    }

    private void getHouseById() throws SQLException {
        System.out.println("\nEnter ID for house");
        int id = INPUT.nextInt();
        System.out.println(houseController.getBy(id));
    }

    private void deleteHouse() throws SQLException {
        System.out.println("\nEnter ID for a house you want to delete");
        int id = INPUT.nextInt();
        System.out.println(houseController.delete(id));
    }

    private void createHouse() throws SQLException {
        System.out.println("\nEnter street id for house");
        Integer streetId = INPUT.nextInt();
        House house = new House(streetId);
        System.out.println(houseController.create(house));
    }

    private void updateHouse() throws SQLException {
        System.out.println("\nEnter ID");
        int id = INPUT.nextInt();
        System.out.println("\nEnter street id");
        Integer streetId = INPUT.nextInt();
        House updatedHouse = new House(id, streetId);
        System.out.println(houseController.update(updatedHouse));
    }

    private void getAllSupermarkets() throws SQLException {
        System.out.println("\nSupermarkets:\n");
        System.out.println(supermarketController.getAll());
    }

    private void getSupermarketById() throws SQLException {
        System.out.println("\nEnter ID for supermarket");
        int id = INPUT.nextInt();
        System.out.println(supermarketController.getBy(id));
    }

    private void deleteSupermarket() throws SQLException {
        System.out.println("\nEnter ID for a supermarket you want to delete");
        int id = INPUT.nextInt();
        System.out.println(supermarketController.delete(id));
    }

    private void createSupermarket() throws SQLException {
        System.out.println("\nEnter description");
        String description = INPUT.next();
        System.out.println("\nEnter areaSize");
        Integer areaSize = INPUT.nextInt();
        System.out.println("\nEnter work scheudle start in hh:mm:ss format");
        String workScheudleStart = INPUT.next();
        System.out.println("\nEnter work scheudle end in hh:mm:ss format");
        String workScheudleEnd = INPUT.next();
        System.out.println("\nEnter average customers amount");
        Integer averageCustomers = INPUT.nextInt();
        System.out.println("\nEnter houseId");
        Integer houseId = INPUT.nextInt();
        Supermarket supermarket = new Supermarket(description, areaSize, workScheudleStart, workScheudleEnd, averageCustomers, houseId);
        System.out.println(supermarketController.create(supermarket));
    }

    private void updateSupermarket() throws SQLException {
        System.out.println("\nEnter id");
        Integer id = INPUT.nextInt();
        System.out.println("\nEnter description");
        String description = INPUT.next();
        System.out.println("\nEnter areaSize");
        Integer areaSize = INPUT.nextInt();
        System.out.println("\nEnter work scheudle start in hh:mm:ss format");
        String workScheudleStart = INPUT.next();
        System.out.println("\nEnter work scheudle end in hh:mm:ss format");
        String workScheudleEnd = INPUT.next();
        System.out.println("\nEnter average customers amount");
        Integer averageCustomers = INPUT.nextInt();
        System.out.println("\nEnter houseId");
        Integer houseId = INPUT.nextInt();
        Supermarket updatedSupermarket = new Supermarket(id, description, areaSize, workScheudleStart, workScheudleEnd, averageCustomers, houseId);
        System.out.println(supermarketController.update(updatedSupermarket));
    }

    private void getAllTradeNetworks() throws SQLException {
        System.out.println("\nTrade networks:\n");
        System.out.println(tradeNetworkController.getAll());
    }

    private void getTradeNetworkById() throws SQLException {
        System.out.println("\nEnter ID for trade network");
        int id = INPUT.nextInt();
        System.out.println(tradeNetworkController.getBy(id));
    }

    private void deleteTradeNetwork() throws SQLException {
        System.out.println("\nEnter ID for trade network you want to delete");
        int id = INPUT.nextInt();
        System.out.println(tradeNetworkController.delete(id));
    }

    private void createTradeNetwork() throws SQLException {
        System.out.println("\nEnter name");
        String name = INPUT.next();
        TradeNetwork tradeNetwork = new TradeNetwork(name);
        System.out.println(tradeNetworkController.create(tradeNetwork));
    }

    private void updateTradeNetwork() throws SQLException {
        System.out.println("\nEnter ID");
        int id = INPUT.nextInt();
        System.out.println("\nEnter name");
        String name = INPUT.next();
        TradeNetwork updatedTradeNetwork = new TradeNetwork(id, name);
        System.out.println(tradeNetworkController.update(updatedTradeNetwork));
    }

    private void getAllAdvertisments() throws SQLException {
        System.out.println("\nAdvertisments:\n");
        System.out.println(advertismentController.getAll());
    }

    private void getAdvertismentById() throws SQLException {
        System.out.println("\nEnter ID for advertisment");
        int id = INPUT.nextInt();
        System.out.println(advertismentController.getBy(id));
    }

    private void deleteAdvertisment() throws SQLException {
        System.out.println("\nEnter ID for an advertisment you want to delete");
        int id = INPUT.nextInt();
        System.out.println(advertismentController.delete(id));
    }

    private void createAdvertisment() throws SQLException {
        System.out.println("\nEnter description");
        String description = INPUT.next();
        System.out.println("\nEnter producer");
        String producer = INPUT.next();
        System.out.println("\nEnter duration in hh:mm:ss format");
        String duration = INPUT.next();
        System.out.println("\nEnter trade network id");
        Integer tradeNetworkId = INPUT.nextInt();
        Advertisment advertisment = new Advertisment(description, producer, duration, tradeNetworkId);
        System.out.println(advertismentController.create(advertisment));
    }

    private void updateAdvertisment() throws SQLException {
        System.out.println("\nEnter id");
        Integer id = INPUT.nextInt();
        System.out.println("\nEnter description");
        String description = INPUT.next();
        System.out.println("\nEnter producer");
        String producer = INPUT.next();
        System.out.println("\nEnter duration in hh:mm:ss format");
        String duration = INPUT.next();
        System.out.println("\nEnter trade network id");
        Integer tradeNetworkId = INPUT.nextInt();
        Advertisment updatedAdvertisment = new Advertisment(id, description, producer, duration, tradeNetworkId);
        System.out.println(advertismentController.update(updatedAdvertisment));
    }

    private void showMenu() {
        System.out.println("\nMENU:");
        for (String str : menu.values()) {
            System.out.println(str);
        }
    }

    private void showMainMenu() {
        System.out.println(menu.get("S"));
        System.out.println(menu.get("Q"));
        System.out.println("Select menu option.");
    }

    public void show() {
        String keyMenu;
        showMainMenu();
        do {
            keyMenu = INPUT.next().toUpperCase();
            try {
                methodsMenu.get(keyMenu).print();
            } catch (Exception ignored) {
            }

        } while (!keyMenu.equals("Q"));
    }
}
