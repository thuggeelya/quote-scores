# Quote Scores
REST API for the web interface in the two wireframes below.
![Quote List](https://developers.kameleoon.com/images/quote-list.png)
![Quote Details](https://developers.kameleoon.com/images/quote-detail.png)

The API allows:
- creation of a user account. User properties are name, email, password and date of creation;
- addition, viewing (including a method to get a random quote), modification, and deletion of quotes (real deletion from the database, not just via an archive flag). Quote properties include content, date of creation / update, link to user who posted it, link to votes;
- voting on quotes (either upvote or downvote);
- view of the top and worse 10 quotes, the details of each quote, and a graph of the evolution of the votes over time.
