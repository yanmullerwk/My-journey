<?php
$riel = 2103942;
$kyat = 19092;
$krones = 109;
$lek = 9094;

echo "riel: ".$riel;
echo "\n kyat:".$kyat;
echo "\n krones:".$krones;
echo "\n lek: ".$lek;

$exchange_rate_riel = 0.00025;
$exchange_rate_kyat = 0.000477;
$exchange_rate_krones = 0.097;
$exchange_rate_lek = 0.012;

$amount_rial = $riel * $exchange_rate_riel;
echo "\n amount rial: ".$amount_rial;

$amount_kyat = $kyat * $exchange_rate_kyat;
echo "\n amount kyat: ".$amount_kyat;

$amount_krones = $krones * $exchange_rate_krones = 0.097;
echo "\n amount krones: ".$amount_krones;

$amount_lek = $lek*$exchange_rate_lek;
echo "\n amount lek: ".$amount_lek;

$final_amount = $amount_rial + $amount_kyat + $amount_krones + $amount_lek-4;
echo "\n final amount: ".$final_amount; 