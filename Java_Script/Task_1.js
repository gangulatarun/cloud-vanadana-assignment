//Take a sentence as an input and reverse every word in that sentence. Example - This is a sunny day > shiT si a ynnus yad.
function reverseWords(sentence) {
    // Split the sentence into an array of words
    let words = sentence.split(' ');

    // Reverse each word in the array
    let reversedWords = words.map(word => reverseWord(word));

    // Join the reversed words back into a sentence
    let reversedSentence = reversedWords.join(' ');

    return reversedSentence;
}

function reverseWord(word) {
    // Split the word into an array of characters, reverse it, and join back
    return word.split('').reverse().join('');
}

// Example usage
let inputSentence = "This is a sunny day";
let reversedResult = reverseWords(inputSentence);

console.log(reversedResult);
