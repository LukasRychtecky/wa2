VIRTUAL_ENV = var/ve
PYTHON_BIN = $(VIRTUAL_ENV)/bin

install: installve pip

installve:
	virtualenv --no-site-packages $(VIRTUAL_ENV)
	$(PYTHON_BIN)/pip install --upgrade pip==1.5
	$(PYTHON_BIN)/pip install setuptools --no-use-wheel --upgrade

pip:
	$(PYTHON_BIN)/pip install --process-dependency-links --allow-all-external -r requirements.txt

runserver:
	$(PYTHON_BIN)/python app/server.py

clean:
	find . -name "*.pyc" -delete;
	find . -type d -empty -delete;
