package gr.aueb.cf.blueapp;

import gr.aueb.cf.blueapp.view_controller.*;

import java.awt.EventQueue;


public class Main {
	
	private final static LandingPage landingPage = new LandingPage();
	private final static SalesPage salesPage = new SalesPage();
	private final static CustomersPage customersPage = new CustomersPage();
	private final static CustomersInsertPage customersInsertPage = new CustomersInsertPage();
	private final static StatisticsPage statisticsPage = new StatisticsPage();
	private final static CustomersUpdatePage customersUpdatePage = new CustomersUpdatePage();
	private final static CustomerStatsPage customerStatsPage = new CustomerStatsPage();
	private final static CustomerViewPage customerViewPage = new CustomerViewPage();
	private final static StockPage stockPage = new StockPage();
	private final static ProductInsertPage productInsertPage = new ProductInsertPage();
	private final static ProductsPage productsPage = new ProductsPage();
	private final static ProductStatsPage productStatsPage = new ProductStatsPage();
	private final static ProductViewPage productViewPage = new ProductViewPage();
	private final static ProductUpdatePage productUpdatePage = new ProductUpdatePage();
	private final static PurchasesPage purchasesPage = new PurchasesPage();
	private final static PurchasesStatsPage purchasesStatsPage = new PurchasesStatsPage();
	private final static PurchasesMaterialsPage purchasesMaterialsPage = new PurchasesMaterialsPage();
	private final static PurchaseMaterialsInsertPage purchaseMaterialsInsertPage = new PurchaseMaterialsInsertPage();
	private final static PurchaseMaterialsStatsPage purchaseMaterialsStatsPage = new PurchaseMaterialsStatsPage();
	private final static PurchaseMaterialsUpdatePage purchaseMaterialsUpdatePage = new PurchaseMaterialsUpdatePage();
	private final static PurchaseMaterialsViewPage purchaseMaterialsViewPage = new PurchaseMaterialsViewPage();
	private final static SuppliersPage suppliersPage = new SuppliersPage();
	private final static SuppliersInsertPage suppliersInsertPage = new SuppliersInsertPage();
	private final static SuppliersStatsPage suppliersStatsPage = new SuppliersStatsPage();
	private final static SuppliersUpdatePage suppliersUpdatePage = new SuppliersUpdatePage();
	private final static SuppliersViewPage suppliersViewPage = new SuppliersViewPage();
	
	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					landingPage.setVisible(true);
					landingPage.setLocationRelativeTo(null);
					
					salesPage.setVisible(false);
					salesPage.setLocationRelativeTo(null);
					
					customersPage.setVisible(false);
					customersPage.setLocationRelativeTo(null);
					
					customersInsertPage.setVisible(false);
					customersInsertPage.setLocationRelativeTo(null);
					
					statisticsPage.setVisible(false);
					statisticsPage.setLocationRelativeTo(null);
					
					customersUpdatePage.setVisible(false);
					customersUpdatePage.setLocationRelativeTo(null);
					
					stockPage.setVisible(false);
					stockPage.setLocationRelativeTo(null);
					
					customerViewPage.setVisible(false);
					customerViewPage.setLocationRelativeTo(null);
					
					customerStatsPage.setVisible(false);
					customerStatsPage.setLocationRelativeTo(null);
					
					productInsertPage.setVisible(false);
					productInsertPage.setLocationRelativeTo(null);
					
					productsPage.setVisible(false);
					productsPage.setLocationRelativeTo(null);
					
					productStatsPage.setVisible(false);
					productStatsPage.setLocationRelativeTo(null);
					
					productViewPage.setVisible(false);
					productViewPage.setLocationRelativeTo(null);
					
					productUpdatePage.setVisible(false);
					productUpdatePage.setLocationRelativeTo(null);
					
					purchasesPage.setVisible(false);
					purchasesPage.setLocationRelativeTo(null);
					
					purchasesStatsPage.setVisible(false);
					purchasesStatsPage.setLocationRelativeTo(null);
					
					purchasesMaterialsPage.setVisible(false);
					purchasesMaterialsPage.setLocationRelativeTo(null);
					
					purchaseMaterialsInsertPage.setVisible(false);
					purchaseMaterialsInsertPage.setLocationRelativeTo(null);
					
					purchaseMaterialsStatsPage.setVisible(false);
					purchaseMaterialsStatsPage.setLocationRelativeTo(null);
					
					purchaseMaterialsUpdatePage.setVisible(false);
					purchaseMaterialsUpdatePage.setLocationRelativeTo(null);
					
					purchaseMaterialsViewPage.setVisible(false);
					purchaseMaterialsViewPage.setLocationRelativeTo(null);
					
					suppliersPage.setVisible(false);
					suppliersPage.setLocationRelativeTo(null);
					
					suppliersInsertPage.setVisible(false);
					suppliersInsertPage.setLocationRelativeTo(null);
					
					suppliersStatsPage.setVisible(false);
					suppliersStatsPage.setLocationRelativeTo(null);
					
					suppliersUpdatePage.setVisible(false);
					suppliersUpdatePage.setLocationRelativeTo(null);
					
					suppliersViewPage.setVisible(false);
					suppliersViewPage.setLocationRelativeTo(null);
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public static LandingPage getLandingPage() {
		return landingPage;
	}

	public static SalesPage getSalesPage() {
		return salesPage;
	}

	public static CustomersPage getCustomersPage() {
		return customersPage;
	}

	public static CustomersInsertPage getCustomersInsertPage() {
		return customersInsertPage;
	}

	public static StatisticsPage getStatisticsPage() {
		return statisticsPage;
	}

	public static CustomersUpdatePage getCustomersUpdatePage() {
		return customersUpdatePage;
	}

	public static StockPage getStockPage() {
		return stockPage;
	}

	public static CustomerStatsPage getCustomerStatsPage() {
		return customerStatsPage;
	}

	public static CustomerViewPage getCustomerViewPage() {
		return customerViewPage;
	}

	public static ProductInsertPage getProductInsertPage() {
		return productInsertPage;
	}

	public static ProductsPage getProductsPage() {
		return productsPage;
	}

	public static ProductStatsPage getProductStatsPage() {
		return productStatsPage;
	}

	public static ProductViewPage getProductViewPage() {
		return productViewPage;
	}

	public static ProductUpdatePage getProductUpdatePage() {
		return productUpdatePage;
	}

	public static PurchasesPage getPurchasesPage() {
		return purchasesPage;
	}

	public static PurchasesStatsPage getPurchasesStatsPage() {
		return purchasesStatsPage;
	}

	public static PurchasesMaterialsPage getPurchasesMaterialsPage() {
		return purchasesMaterialsPage;
	}

	public static PurchaseMaterialsInsertPage getPurchaseMaterialsInsertPage() {
		return purchaseMaterialsInsertPage;
	}

	public static PurchaseMaterialsStatsPage getPurchaseMaterialsStatsPage() {
		return purchaseMaterialsStatsPage;
	}

	public static PurchaseMaterialsUpdatePage getPurchaseMaterialsUpdatePage() {
		return purchaseMaterialsUpdatePage;
	}

	public static PurchaseMaterialsViewPage getPurchaseMaterialsViewPage() {
		return purchaseMaterialsViewPage;
	}

	public static SuppliersPage getSuppliersPage() {
		return suppliersPage;
	}

	public static SuppliersInsertPage getSuppliersInsertPage() {
		return suppliersInsertPage;
	}

	public static SuppliersStatsPage getSuppliersStatsPage() {
		return suppliersStatsPage;
	}

	public static SuppliersUpdatePage getSuppliersUpdatePage() {
		return suppliersUpdatePage;
	}

	public static SuppliersViewPage getSuppliersViewPage() {
		return suppliersViewPage;
	}
	
	
	
	

}
