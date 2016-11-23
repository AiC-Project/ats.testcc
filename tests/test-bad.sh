#!/bin/bash

docker run -i aic.testcc bash /home/developer/scripts/compile.sh >/dev/null 2>&1 <<EOT
nonsense
EOT

if [ $? -eq 0 ]; then
    echo Test failed
else
    echo Test passsed
fi

