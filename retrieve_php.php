<?php
$m=new MongoClient();
echo "\nConnection to Database Successfully";
$db=$m->TYITDB;
echo "\nDatabase selected successfully";
$col=$db->TYITCOL;
echo "\nCollection selected successfully <br/>";

$cursor=$col->find();
foreach($cursor as $doc)
{
echo $doc["name"]."<br/>";
echo $doc["age"]."<br/>";
echo $doc["dept"]."<br/>";
echo $doc["pin"]."<br/>";
}
?>