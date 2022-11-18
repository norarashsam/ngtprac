<?php
$m=new MongoClient();
echo "\nConnection to Database Successfully";
$db=$m->TYITDB;
echo "\nDatabase selected successfully";
$col=$db->TYITCOL;
echo "\nCollection selected successfully";

$doc=array(
"name"=>"Rohit",
"age"=>20,
"dept"=>TYIT,
"pin"=>229667
);

$col->insert($doc);
echo "\nDocument inserted successfully";
?>