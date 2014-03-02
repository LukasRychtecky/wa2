wa2
===

Zdrojový kód pro výuku - Vývoj webových aplikací 2 (A4M39WA2)

Prerekvizity
------------

### Java

- stáhni si [JSBoss AS](https://www.jboss.org/jbossas/downloads) a rozbal (třeba do /opt/local/etc/jboss)
- nastav si JBOSS_HOME proměnnou, e.g. `echo "export JBOSS_HOME=/opt/local/etc/jboss" >> ~/.profile`
- spusť server ($JBOSS_HOME/bin/standalone.sh) [http://localhost:8080/](http://localhost:8080/)

Tipy
----

- V každém adresáři s kódem pro dané cvičení se nachází Makefile, doporučuji prozkoumat
- Server se spustí pomocí příkazu `make runserver`
- Javu se zkompiluje a nasadí `make deploy`
