import { render, screen } from '@testing-library/react';
import App from './App';
describe('true is truthy and false is falsy', () => {
  test('true is truthy', () => {
    expect(true).toBe(true);
  });
 
  test('false is falsy', () => {
    expect(false).toBe(true);
  });
});


describe("helloWorld", () => {
  it("returns hello world", () => {
    var actual = helloWorld();
    expect(actual).toBe("hello");
  });
});

test('renders learn react link', () => {
  render(<App />);
  const linkElement = screen.getByText(/first/i);
  expect(linkElement).toBeInTheDocument();
});
