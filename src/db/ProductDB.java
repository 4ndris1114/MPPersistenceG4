package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import model.Product;
import model.ProductType;

public class ProductDB implements ProductDBIF {

	private static final String FIND_ALL_Q = "SELECT id, name, purchasePrice, salesPrice, rentPrice, countryOfOrigin, currentStock, productType, supplierId FROM Product";
	private PreparedStatement findAllPS;

	private static final String INSERT_Q = "INSERT INTO Product(name, purchasePrice, salesPrice, rentPrice, countryOfOrigin, currStock, productType) VALUES(?,?,?,?,?,?,?)";
	private PreparedStatement insertPS; // add: Statement.RETURN_GENERATED_KEYS as a second argument   - when preparing statement (as second parameter)
	
	private static final String INSERT_CLOTHING_Q = "INSERT INTO Clothing(productId, size, color) values(?, ?, ?)";
	private PreparedStatement insertClothingPS;
	
	private static final String INSERT_EQUIPEMENT_Q = "INSERT INTO Equipement(productId, type, description) values(?, ?, ?)";
	private PreparedStatement insertEquipementPS;
	
	private static final String INSERT_GUNREPLICA_Q = "INSERT INTO GunReplica(productId, calibre, material) values(?, ?, ?)";
	private PreparedStatement insertGunReplicaPS;
	
	private static final String DELETE_Q = "DELETE FROM Product WHERE id = ?";
	private PreparedStatement deletePS;
	
	private static final String UPDATE_Q = "UPDATE Product SET name = ? , SET purchasePrice = ?, SET salesPrice = ?, SET rentPrice = ?, SET countryOfOrigin = ?, SET currStock = ?, supplierId = ? WHERE productId = ?";
	private PreparedStatement updatePS;
	
	private static final String FIND_BY_ID_Q = FIND_ALL_Q + " WHERE id = ?";
	private PreparedStatement findByIdPS;
	
	private static final String ADD_STOCK_Q = "UPDATE Product SET currStock = ? WHERE id = ?";
	private PreparedStatement addStockPS;
	
	public ProductDB() throws DataAccessException {
		init();
	}
	
	public void init() throws DataAccessException {
		Connection con = DbConnection.getInstance().getConnection();
	}
	
	@Override
	public Product insert(Product p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product delete(Product p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product update(Product p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product addStock(int amount, Product p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	private Product buildObject(ResultSet rs) {
		return null;
	}
	
	private List<Product> buildObjects(ResultSet rs) {
		return null;
	}
	
}
