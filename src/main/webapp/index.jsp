<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />

    <!-- Bootstrap CSS -->
    <link
      rel="stylesheet"
      href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
      integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk"
      crossorigin="anonymous"
    />

    <!-- File css -->
    <link rel="stylesheet" href="css/style.css" />

    <title>Calorie Counter</title>
  </head>

  <body>
    <header>
      <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <a class="navbar-brand" href="#">Calorie Counter</a>
        <button
          class="navbar-toggler"
          type="button"
          data-toggle="collapse"
          data-target="#navbarNav"
          aria-controls="navbarNav"
          aria-expanded="false"
          aria-label="Toggle navigation"
        >
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
          <ul class="navbar-nav">
            <li class="nav-item active">
              <a class="nav-link" href="#"
                >Homes <span class="sr-only">(current)</span></a
              >
            </li>
            <li class="nav-item">
              <a class="nav-link" href="#">Features</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="#">Pricing</a>
            </li>
          </ul>
        </div>
      </nav>
    </header>

    <main>
      <div class="container mt-4">
        <form method="POST" action="foods">
          <legend>
            <h1 class="font-bold">Add Food</h1>
          </legend>
          <div class="form-row">
            <div class="form-group col-md-4">
              <label for="foodName">Name</label>
              <input
                type="text"
                class="form-control"
                id="foodName"
                placeholder="Strawberries"
                name="foodName"
              />
            </div>

            <div class="form-group col-md-2">
              <label for="calories">Calories</label>
              <input
                type="number"
                min="0"
                class="form-control"
                id="calories"
                placeholder="40"
                name="calories"
              />
            </div>

            <div class="form-group col-md-2">
              <label for="carbohydrates">Carbohydrates</label>
              <input
                type="number"
                min="0"
                class="form-control"
                id="carbohydrates"
                placeholder="9"
                name="carbohydrates"
              />
            </div>

            <div class="form-group col-md-2">
              <label for="fat">Fat</label>
              <input
                type="number"
                min="0"
                class="form-control"
                id="fat"
                placeholder="0"
                name="fat"
              />
            </div>

            <div class="form-group col-md-2">
              <label for="protein">Protein</label>
              <input
                type="number"
                min="0"
                class="form-control"
                id="protein"
                placeholder="1"
                name="protein"
              />
            </div>
          </div>
          <button type="submit" class="btn btn-primary">Submit</button>
        </form>
        <form method="GET" action="foods">
          <legend>
            <h1 class="font-bold">Search For a Food</h1>
          </legend>
          <div class="form-row">
            <div class="form-group col-md-4">
              <label for="foodName">Name</label>
              <input
                type="text"
                class="form-control"
                id="foodName"
                placeholder="Strawberries"
                name="foodName"
              />
            </div>
          </div>
          <button type="submit" class="btn btn-primary">Submit</button>
        </form>
      </div>
    </main>
  </body>

  <!-- Bootstrap CSS -->
  <script
    src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
    integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
    crossorigin="anonymous"
  ></script>
  <script
    src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
    integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
    crossorigin="anonymous"
  ></script>
  <script
    src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"
    integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI"
    crossorigin="anonymous"
  ></script>
</html>
