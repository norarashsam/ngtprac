<?php
$m=new MongoClient();
echo "\nConnection to Database Successfully";
$db=$m->TYITDB;
echo "\nDatabase selected successfully";
$col=$db->TYITCOL;
echo "\nCollection selected successfully";

$col->remove(array("name"=>"Rohit"));
echo "\nDocument deleted successfully";
?>