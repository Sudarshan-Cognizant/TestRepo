package appmodel.casedetail.orchestration.agreementdetails.dao.caseassignedto;

import java.util.List;
import com.cognizant.trumobi.appintegration.clientsdk.dao.Property;
import com.cognizant.trumobi.appintegration.clientsdk.db.EntityDao;
import com.cognizant.trumobi.appintegration.clientsdk.dao.query.Query;
import com.cognizant.trumobi.appintegration.clientsdk.dao.query.QueryBuilder;
import com.cognizant.trumobi.appintegration.clientsdk.db.DaoSession;
import com.cognizant.trumobi.appintegration.clientsdk.db.Entity;
import com.cognizant.trumobi.appintegration.clientsdk.dao.internal.DaoConfig;

public class CaseAssignedToDaoRTest extends EntityDao {	
public static final String TABLENAME = "CaseDetail_agreementDetails_AgreementDetails_caseAssignedTo";

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
	public final static Property caseAssignedTo = new Property(8,String.class,"caseAssignedTo", false,"caseAssignedTo");
}
public List<appmodel.casedetail.orchestration.agreementdetails.model.caseassignedto.CaseAssignedTo> executeQuery(long foreignKey) {
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
List<appmodel.casedetail.orchestration.agreementdetails.model.caseassignedto.CaseAssignedTo> modelFileObjects = (List<appmodel.casedetail.orchestration.agreementdetails.model.caseassignedto.CaseAssignedTo>) list;
	return modelFileObjects;
}

public CaseAssignedToDao(DaoConfig config)
{
	super(config, TABLENAME);
}

public CaseAssignedToDao(DaoConfig config, DaoSession daoSession)
{
	super(config, daoSession, TABLENAME);
}
}
