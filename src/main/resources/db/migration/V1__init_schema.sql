CREATE TABLE patients (
                          id BIGSERIAL PRIMARY KEY,
                          first_name VARCHAR(255) NOT NULL,
                          last_name  VARCHAR(255) NOT NULL,
                          phone      VARCHAR(50),
                          email      VARCHAR(255),
                          birth_date DATE,
                          medical_history VARCHAR(2000),
                          allergies VARCHAR(2000),
                          created_at TIMESTAMP NOT NULL DEFAULT now(),
                          updated_at TIMESTAMP NOT NULL DEFAULT now()
);
