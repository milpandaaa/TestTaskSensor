DROP TABLE IF EXISTS sensordata;

CREATE TABLE sensorData (
                            ID INT PRIMARY KEY NOT NULL,
                            objectId INT NOT NULL,
                            sensorId INT NOT NULL,
                            time INT NOT NULL,
                            value DOUBLE NOT NULL
);