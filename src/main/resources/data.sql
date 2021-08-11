DROP TABLE IF EXISTS sensorData;

CREATE TABLE sensorData (
                            objectId INT NOT NULL,
                            sensorId INT NOT NULL,
                            time INT NOT NULL,
                            value DOUBLE NOT NULL
);