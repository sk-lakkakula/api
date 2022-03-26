<!DOCTYPE html>
<html lang="en">
  <head>
    <title>CSS Template</title>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <style>
      * {
        box-sizing: border-box;
      }

      body {
        font-family: Arial, Helvetica, sans-serif;
      }

      /* Style the header */
      header {
        background-color: green;
        padding: 1px;
        text-align: center;
        color: white;
        text-align: center;
        font-size: 25px;
        font-family: Roboto;
      }

      /* Container for flexboxes */
      section {
        display: -webkit-flex;
        display: flex;
      }

      /* Style the navigation menu */
      nav {
        -webkit-flex: 1;
        -ms-flex: 1;
        flex: 1;
        background: #ccc;
        padding: 20px;
      }

      /* Style the list inside the menu */
      nav ul {
        list-style-type: none;
        padding: 0;
      }

      /* Style the content */
      article {
        -webkit-flex: 3;
        -ms-flex: 3;
        flex: 3;

        padding: 10px;
      }

      /* Style the footer */
      footer {
        background-color: green;
        padding: 1px;
        color: white;
        text-align: center;
        font-size: 15px;
        font-family: Roboto;
      }

      /* Responsive layout - makes the menu and the content (inside the section) sit on top of each other instead of next to each other */
      @media (max-width: 600px) {
        section {
          -webkit-flex-direction: column;
          flex-direction: column;
        }
      }
    </style>
  </head>
  <body>
    <header>
      <h4>Vishudha Tagline Traders - Invoice #${OrderNo}</h4>
    </header>

    <section>
      <article>
        <p>Hello <b>${Name},</b></p>
        ,<br />
        <p>Thank you for your order.</p>
        <p>Order # ${OrderNo}.</p>
        <p>
          We’ll send a confirmation when your order ships. Your estimated
          delivery date is indicated below. If you would like to view the status
          of your order or make any changes to it, please visit Your Orders on
          taglinetraders.com.
        </p>
      </article>
    </section>
    <section>
      <article>
        <h5>Arriving :</h5>
        <p>${ArrivingDate}</p>
      </article>
      <article>
        <h5>Your order will be sent to:</h5>
        <p>${Address}</p>
      </article>
    </section>
    <section>
      <article>
        <h5>Order summary</h5>
        <p>Order #${OrderNo}</p>
        <br />
      </article>
      <article>
        <h5>Order Date:</h5>
        <p>${OrderDate}</p>
      </article>

      <article>
        <h5>Item Subtotal:</h5>
        <p>INR .${ItemsPrice}</p>
      </article>
      <article>
        <h5>Order Total:</h5>
        <p>INR ${TotalPrice}</p>
      </article>
    </section>

    <footer>
      <p>
        To ensure your safety, the Delivery Agent will drop the package at your
        doorstep, ring the doorbell and then move back 2 meters while waiting
        for you to collect your package. If you are in a containment zone, the
        agent will call you and request you to collect your package from the
        nearest accessible point while following the same No-Contact delivery
        process. We hope to see you again soon.
      </p>
    </footer>
  </body>
</html>
