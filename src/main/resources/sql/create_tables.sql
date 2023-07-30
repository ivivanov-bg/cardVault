
 create table account(
   id UUID PRIMARY KEY,
  name varchar(1000),
  email varchar(1000),
  password varchar(1000)
  ) 
  

  
create table vendor(
  id UUID PRIMARY KEY,
  name varchar(1000) ,
  image blob,
  url varchar(1000)
)
;

create table card (
  id UUID PRIMARY KEY,
  vendor_id UUID NOT NULL,
  account_id UUID NOT NULL,
  name varchar(1000),
  code varchar(1000),
  f_image blob,
  b_image blob
)
