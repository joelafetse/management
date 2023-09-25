CREATE TABLE member
( member_id BIGINT PRIMARY KEY IDENTITY,
  last_name VARCHAR(100) NOT NULL,
  first_name VARCHAR(100) NOT NULL,
  is_active BIT NOT NULL,
  position VARCHAR(50) NOT NULL,
  phone_number VARCHAR(20),
  email_address VARCHAR(120),
  home_address VARCHAR(150),
  remarks VARCHAR(4000)
);