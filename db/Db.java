import java.util.UUID;

public class Db {

    private DbSetting DbSetting;
    private MyEntity myEntity;

    public Db(DbSetting DbSetting) {
        this.DbSetting = DbSetting;
        myEntity = new MyEntity("first");
        myEntity.setId(UUID.randomUUID());
    }

    public DbSetting getDbSetting() {
        return DbSetting;
    }

    public MyEntity getMyEntity() {
        return myEntity;
    }

    public void setMyEntity (MyEntity myEntity) {
        this.myEntity = myEntity;
    }
}
