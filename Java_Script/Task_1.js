//Take a sentence as an input and reverse every word in that sentence. Example - This is a sunny day > shiT si a ynnus yad.
function reverseWords(sentence) {
    let words = sentence.split(' ');

    let reversedWords = words.map(word => reverseWord(word));

    let reversedSentence = reversedWords.join(' ');

    return reversedSentence;
}

function reverseWord(word) {
    return word.split('').reverse().join('');
}

// Example usage
let inputSentence = "This is a sunny day";
let reversedResult = reverseWords(inputSentence);

console.log(reversedResult);
