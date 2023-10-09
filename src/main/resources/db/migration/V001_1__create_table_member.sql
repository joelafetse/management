CREATE TABLE member
( member_id BIGINT PRIMARY KEY IDENTITY,
  last_name VARCHAR(100) NOT NULL,
  first_name VARCHAR(100) NOT NULL,
  gender  CHAR(1) NOT NULL,
  is_active BIT NOT NULL,
  nationality VARCHAR(100) NOT NULL,
  title VARCHAR(70),
  phone_number VARCHAR(20),
  email_address VARCHAR(120),
  home_address VARCHAR(200),
  remarks VARCHAR(4000)
);