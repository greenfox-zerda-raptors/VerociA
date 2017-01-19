CREATE TABLE building(buildingType varchar(255), level BIGINT, hp BIGINT, primary key (buildingType));
CREATE TABLE resource(resourceType VARCHAR(255), amount BIGINT, PRIMARY KEY (resourceType));
CREATE TABLE troop(troopType VARCHAR(255), hp BIGINT, attackpw BIGINT, defencepw BIGINT, generationtime BIGINT, PRIMARY KEY (troopType));