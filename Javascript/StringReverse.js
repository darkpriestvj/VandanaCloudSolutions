function reverseWords(input) {
  let words = input.split(" ");
  let reverseWords = words.map(function (word) {
    return word.split("").reverse().join("");
  });

  const output = reverseWords.join(" ");
  return output;
}

var input = "This is a sunny day";
var reversedString = reverseWords(input);
console.log(reversedString);
