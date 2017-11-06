package wiki.qd.shopmall.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import wiki.qd.newshop.entity.CommonInfo;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "COMMON_INFO".
*/
public class CommonInfoDao extends AbstractDao<CommonInfo, Void> {

    public static final String TABLENAME = "COMMON_INFO";

    /**
     * Properties of entity CommonInfo.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property User_agreement = new Property(0, String.class, "user_agreement", false, "USER_AGREEMENT");
        public final static Property File_domain = new Property(1, String.class, "file_domain", false, "FILE_DOMAIN");
    }


    public CommonInfoDao(DaoConfig config) {
        super(config);
    }
    
    public CommonInfoDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"COMMON_INFO\" (" + //
                "\"USER_AGREEMENT\" TEXT," + // 0: user_agreement
                "\"FILE_DOMAIN\" TEXT);"); // 1: file_domain
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"COMMON_INFO\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, CommonInfo entity) {
        stmt.clearBindings();
 
        String user_agreement = entity.getUser_agreement();
        if (user_agreement != null) {
            stmt.bindString(1, user_agreement);
        }
 
        String file_domain = entity.getFile_domain();
        if (file_domain != null) {
            stmt.bindString(2, file_domain);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, CommonInfo entity) {
        stmt.clearBindings();
 
        String user_agreement = entity.getUser_agreement();
        if (user_agreement != null) {
            stmt.bindString(1, user_agreement);
        }
 
        String file_domain = entity.getFile_domain();
        if (file_domain != null) {
            stmt.bindString(2, file_domain);
        }
    }

    @Override
    public Void readKey(Cursor cursor, int offset) {
        return null;
    }    

    @Override
    public CommonInfo readEntity(Cursor cursor, int offset) {
        CommonInfo entity = new CommonInfo( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // user_agreement
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1) // file_domain
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, CommonInfo entity, int offset) {
        entity.setUser_agreement(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setFile_domain(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
     }
    
    @Override
    protected final Void updateKeyAfterInsert(CommonInfo entity, long rowId) {
        // Unsupported or missing PK type
        return null;
    }
    
    @Override
    public Void getKey(CommonInfo entity) {
        return null;
    }

    @Override
    public boolean hasKey(CommonInfo entity) {
        // TODO
        return false;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}