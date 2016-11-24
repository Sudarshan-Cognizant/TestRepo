package appmodel.casedetail.orchestration.agreementdetails.dao.assetdetail;

import java.util.List;
import com.cognizant.trumobi.appintegration.clientsdk.dao.Property;
import com.cognizant.trumobi.appintegration.clientsdk.db.EntityDao;
import com.cognizant.trumobi.appintegration.clientsdk.dao.query.Query;
import com.cognizant.trumobi.appintegration.clientsdk.dao.query.QueryBuilder;
import com.cognizant.trumobi.appintegration.clientsdk.db.DaoSession;
import com.cognizant.trumobi.appintegration.clientsdk.db.Entity;
import com.cognizant.trumobi.appintegration.clientsdk.dao.internal.DaoConfig;

public class AssetDetailDao extends EntityDao {	
public static final String TABLENAME = "CaseDetail_agreementDetails_AgreementDetails_assetDetail";

public static final String PRIMARY_KEY = null;
private Query<Entity> daoFileQuery;
private DaoSession daoSession;
public static class Properties {
	public final static Property __Id = new Property(0, Long.class, "__Id", true, "__Id");
	public final static Property Is_Synced = new Property(1, Boolean.class, "Is_Synced", false, "Is_Synced");
	public final static Property __foreignId  = new Property(2, Long.class, "__foreignId", false, "__foreignId");
	public final static Property TRANSACTION_ID = new Property(3, String.class, "TRANSACTION_ID", false, "TRANSACTION_ID");
	public final static Property SYNC_STATUS = new Property(4, Long.class, "SYNC_STATUS", false, "SYNC_STATUS");
	public final static Property ACTION_TYPE = new Property(5, String.class, "ACTION_TYPE", false, "ACTION_TYPE");
	public final static Property CREATE_DATE = new Property(6, Long.class, "CREATE_DATE", false, "CREATE_DATE");
	public final static Property DATA_VERSION = new Property(7,Double.class,"DATA_VERSION", false,"DATA_VERSION");
	public final static Property assetName = new Property(8,String.class,"assetName", false,"assetName");
	public final static Property assetValue = new Property(9,String.class,"assetValue", false,"assetValue");
	public final static Property chassisNo = new Property(10,String.class,"chassisNo", false,"chassisNo");
	public final static Property engineNo = new Property(11,String.class,"engineNo", false,"engineNo");
	public final static Property make = new Property(12,String.class,"make", false,"make");
	public final static Property makeID = new Property(13,String.class,"makeID", false,"makeID");
	public final static Property model = new Property(14,String.class,"model", false,"model");
	public final static Property modelID = new Property(15,String.class,"modelID", false,"modelID");
	public final static Property registrationDate = new Property(16,String.class,"registrationDate", false,"registrationDate");
	public final static Property registrationNo = new Property(17,String.class,"registrationNo", false,"registrationNo");
	public final static Property vehicleCondition = new Property(18,String.class,"vehicleCondition", false,"vehicleCondition");
	public final static Property yearOfManufacture = new Property(19,String.class,"yearOfManufacture", false,"yearOfManufacture");
}
public List<appmodel.casedetail.orchestration.agreementdetails.model.assetdetail.AssetDetail> executeQuery(long foreignKey) {
	synchronized (this) {
		if (daoFileQuery == null) {
QueryBuilder<Entity> queryBuilder = queryBuilder();
		queryBuilder.where(Properties.__foreignId.eq(null));
		daoFileQuery = queryBuilder.build();
	}
	}
Query<Entity> query = daoFileQuery.forCurrentThread();
	query.setParameter(0, foreignKey);
	List list = query.list();
List<appmodel.casedetail.orchestration.agreementdetails.model.assetdetail.AssetDetail> modelFileObjects = (List<appmodel.casedetail.orchestration.agreementdetails.model.assetdetail.AssetDetail>) list;
	return modelFileObjects;
}

public AssetDetailDao(DaoConfig config)
{
	super(config, TABLENAME);
}

public AssetDetailDao(DaoConfig config, DaoSession daoSession)
{
	super(config, daoSession, TABLENAME);
}
}